package com.example.demo.mapper;

import com.example.demo.pojo.Education;
import com.example.demo.pojo.EducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    long countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(Long eId);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(Long eId);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
    
    List<Education> getAll();
}