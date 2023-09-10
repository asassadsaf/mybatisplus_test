package com.fkp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.test.entity.KekInfo;
import com.fkp.test.entity.KmsServer;
import com.fkp.test.mapper.KekInfoMapper;
import com.fkp.test.mapper.KmsServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

@SpringBootTest
class MybatisplusDemosApplicationTests {

    @Autowired
    private KmsServerMapper kmsServerMapper;

    @Autowired
    private KekInfoMapper kekInfoMapper;

    @Test
    void test() {
        List<KmsServer> kmsServers = kmsServerMapper.selectList(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getId, "1"));
        System.out.println(kmsServers);
    }

    @Test
    void test2() {
        Map<SFunction<KmsServer, ?>, Object> queryCondition = new HashMap<>();
        queryCondition.put(KmsServer::getTypeName, "REST");
        queryCondition.put(KmsServer::getDevelLanguage, "java");
        List<KmsServer> kmsServers = kmsServerMapper.selectList(Wrappers.lambdaQuery(KmsServer.class).allEq(queryCondition));
        System.out.println(kmsServers);
    }

    @Test
    void test3() {
        LambdaQueryWrapper<KmsServer> kmsServerLambdaQueryWrapper = Wrappers.lambdaQuery(KmsServer.class);
        kmsServerLambdaQueryWrapper.eq(KmsServer::getDevelLanguage, "java");
        kmsServerLambdaQueryWrapper.eq(KmsServer::getTypeName, "REST");
        List<KmsServer> kmsServers = kmsServerMapper.selectList(kmsServerLambdaQueryWrapper);
        System.out.println(kmsServers);
    }

    @Test
    void test4() {
        boolean rest = kmsServerMapper.exists(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getTypeName, "REST"));
        System.out.println(rest);
    }

    @Test
    void test5() {
        Page<KmsServer> kmsServerPage = new Page<>();
        kmsServerPage.setSize(2);
        kmsServerPage.setCurrent(1);
//        OrderItem orderItem = new OrderItem();
//        orderItem.setColumn("create_date");
//        orderItem.setAsc(false);
//        kmsServerPage.setOrders(Collections.singletonList(orderItem));
        Page<KmsServer> pageInfo = kmsServerMapper.selectPage(kmsServerPage, Wrappers.lambdaQuery(KmsServer.class).orderByDesc(KmsServer::getCreateDate));
        List<KmsServer> records = pageInfo.getRecords();
        long total = pageInfo.getTotal();
        System.out.println(records.stream().map(KmsServer::getTypeName).collect(Collectors.toList()));
        System.out.println(records.size());
        System.out.println(total);
    }

    @Test
    void test6() {
        Page<Map<String, Object>> kmsServerPage = new Page<>();
        kmsServerPage.setSize(2);
        kmsServerPage.setCurrent(1);
        Page<Map<String, Object>> mapPage = kmsServerMapper.selectMapsPage(kmsServerPage, Wrappers.emptyWrapper());
        long total = mapPage.getTotal();
        List<Map<String, Object>> records = mapPage.getRecords();
        System.out.println(records.stream().map(map -> map.get("type_name")).collect(Collectors.toList()));
        System.out.println(records.size());
        System.out.println(total);
    }

    @Test
    void test7() {
        List<KmsServer> visa = kmsServerMapper.selectList(Wrappers.lambdaQuery(KmsServer.class).like(KmsServer::getKmsUser, "hw"));
        System.out.println(visa.stream().map(KmsServer::getTypeName).collect(Collectors.toList()));
    }

    @Test
    void test8() {
        List<KmsServer> visa = kmsServerMapper.selectAllLikeKmsUser("hw");
        System.out.println(visa);
    }

    /**
     * sqlite数据库两个jdbc进程访问时，查询时能查询，不能修改；修改时不能查询，不能修改
     */
    @Test
    void test9() {
        KmsServer rest = kmsServerMapper.selectOne(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getTypeName, "STANDARD"));
        System.out.println(rest);
//        for (int i = 0; i < 100000; i++) {
//            rest.setUpdateDate(new Date());
            int insert = kmsServerMapper.updateById(rest);
//        }

    }

    @Test
    void test10(){
        //select Alg,ChangeNo from xxx where DevID = "123";
        KekInfo kekInfo = kekInfoMapper.selectOne(Wrappers.lambdaQuery(KekInfo.class).select(KekInfo::getAlg, KekInfo::getChangeNo).eq(KekInfo::getDevId, "123"));
        System.out.println(kekInfo);
        //select count(*) from xxx;
        Long aLong = kekInfoMapper.selectCount(Wrappers.emptyWrapper());
        System.out.println(aLong);
    }

}
