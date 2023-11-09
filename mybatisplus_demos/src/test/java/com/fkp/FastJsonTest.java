package com.fkp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.util.TypeUtils;
import com.fkp.test.entity.BaseResponse;
import com.fkp.test.entity.KekInfo;
import com.fkp.test.entity.LoginResp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/25 17:28
 */
public class FastJsonTest {

    @Test
    void test(){
        BaseResponse build = new BaseResponse();
        build.setRespCode(0);
        build.setOper("sa");
        build.setGWAccount("avc");
//        TypeUtils.compatibleWithJavaBean = true;
//        TypeUtils.compatibleWithFieldName = true;
//        TypeUtils.compatibleWithJavaBean = true;
        String json = JSON.toJSONString(build, new PascalNameFilter());
        System.out.println(json);
        System.out.println();
    }
}
