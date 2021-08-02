package com.example.demo.mapper;

import com.example.demo.pojo.Fclass;
import com.example.demo.pojo.FclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FclassMapper {
    long countByExample(FclassExample example);

    int deleteByExample(FclassExample example);

    int deleteByPrimaryKey(Long cId);

    int insert(Fclass record);

    int insertSelective(Fclass record);

    List<Fclass> selectByExample(FclassExample example);

    Fclass selectByPrimaryKey(Long cId);

    int updateByExampleSelective(@Param("record") Fclass record, @Param("example") FclassExample example);

    int updateByExample(@Param("record") Fclass record, @Param("example") FclassExample example);

    int updateByPrimaryKeySelective(Fclass record);

    int updateByPrimaryKey(Fclass record);
}