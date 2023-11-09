package com.fkp.test.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
//@NoArgsConstructor
//@SuperBuilder
public class BaseResponse {

    private Integer RespCode;

    private String Oper;

    private String GWAccount;
//
//    public JSONObject getJsonData() {
//        return (JSONObject)JSON.toJSON(this);
//    }
}
