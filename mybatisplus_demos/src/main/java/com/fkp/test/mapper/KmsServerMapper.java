package com.fkp.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fkp.test.entity.KmsServer;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fengkunoeng
 * @since 2023-05-09
 */
public interface KmsServerMapper extends BaseMapper<KmsServer> {

    List<KmsServer> selectAllLikeKmsUser(String kmsUser);
}
