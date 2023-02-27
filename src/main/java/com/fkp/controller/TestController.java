package com.fkp.controller;

import com.fkp.domain.LogConfiguration;
import com.fkp.mapper.LogConfigurationMapper;
import com.fkp.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Transactional注解可以作用于接口、接口方法、类以及类方法上
 * 1. 当作用于类上时，该类的所有 public 方法将都具有该类型的事务属性
 * 2. 当作用在方法级别时会覆盖类级别的定义
 * 3. 当作用在接口和接口方法时则只有在使用基于接口的代理时它才会生效，也就是JDK动态代理，而不是Cglib代理
 * 4. 当在 protected、private 或者默认可见性的方法上使用 @Transactional 注解时是不会生效的，也不会抛出任何异常
 * 5. 默认情况下，只有来自外部的方法调用才会被AOP代理捕获，也就是，类内部方法调用本类内部的其他方法并不会引起事务行为，即使被调用方法使用@Transactional注解进行修饰
 * 6. 来自外部调用的方法需要添加注解，在该方法中调用的其他方法中存在事务回滚的情况也会正常回滚，即外部调用A方法，A方法调用B方法，B方法中存在插库操作且发生了异常且正常抛出到A方法，A方法将异常抛出，此时B方法不需要添加注解，只需要A方法添加注解即可完成回滚操作
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private LogConfigurationMapper logConfigurationMapper;

    @RequestMapping(value = "/save",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    //不指定回滚的异常类型时默认为RuntimeException及其子类，可以指定Exception即可通过直接抛出检查异常也可以回滚事务
    @Transactional(rollbackFor = {IOException.class})
    public String save(@RequestParam("id") String id) throws FileNotFoundException {
        LogConfiguration logConfiguration = new LogConfiguration();
        logConfiguration.setId(id);
        int i = logConfigurationMapper.insertSelective(logConfiguration);

        FileInputStream fileInputStream = new FileInputStream("C:\\a");

        return String.valueOf(i);
    }


    @RequestMapping(value = "innerCall", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @Transactional
    public String innerCall(@RequestParam("id") String id){
//        String result;
//        try {
//            result = save(id);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
        String result = null;
        try {
            //在innerCall方法中调用save方法时save方法无需添加注解，save方法中的异常要抛出不能吞掉，innerCall如果捕获save方法的异常要重新抛出
            result = save(id);
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
        return result;
    }
}
