package com.fkp.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.fkp.domain.KmsServer;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    <P extends IPage<KmsServer>> P findPage22(P page, @Param("obj") KmsServer obj);

    KmsServer findById(String id);
}
