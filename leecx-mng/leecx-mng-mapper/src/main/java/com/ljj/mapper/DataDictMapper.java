package com.ljj.mapper;

import com.ljj.pojo.DataDict;
import com.ljj.pojo.DataDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictMapper {
    int countByExample(DataDictExample example);

    int deleteByExample(DataDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataDict record);

    int insertSelective(DataDict record);

    List<DataDict> selectByExample(DataDictExample example);

    DataDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataDict record , @Param("example") DataDictExample example);

    int updateByExample(@Param("record") DataDict record , @Param("example") DataDictExample example);

    int updateByPrimaryKeySelective(DataDict record);

    int updateByPrimaryKey(DataDict record);
}