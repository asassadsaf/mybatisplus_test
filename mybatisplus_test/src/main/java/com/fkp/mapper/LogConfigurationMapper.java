package com.fkp.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.domain.LogConfiguration;
import com.fkp.domain.LogConfigurationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fkp
 * @time: 2022-11-11 16:51:38
 * @description:
 */
public interface LogConfigurationMapper {

    Page<LogConfiguration> findPage(@Param("obj") LogConfigurationExample example,Page<LogConfiguration> page);

    long countByExample(LogConfigurationExample example);

    int deleteByExample(LogConfigurationExample example);

    int deleteByPrimaryKey(String id);

    int insert(LogConfiguration row);

    int insertSelective(LogConfiguration row);

    List<LogConfiguration> selectByExample(LogConfigurationExample example);

    LogConfiguration selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("row") LogConfiguration row, @Param("example") LogConfigurationExample example);

    int updateByExample(@Param("row") LogConfiguration row, @Param("example") LogConfigurationExample example);

    int updateByPrimaryKeySelective(LogConfiguration row);

    int updateByPrimaryKey(LogConfiguration row);
}
