package com.example.demo.mapper;

import com.example.demo.pojo.HouseHold;
import com.example.demo.pojo.HouseHoldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseHoldMapper {
    long countByExample(HouseHoldExample example);

    int deleteByExample(HouseHoldExample example);

    int deleteByPrimaryKey(Long hId);

    int insert(HouseHold record);

    int insertSelective(HouseHold record);

    List<HouseHold> selectByExample(HouseHoldExample example);

    HouseHold selectByPrimaryKey(Long hId);

    int updateByExampleSelective(@Param("record") HouseHold record, @Param("example") HouseHoldExample example);

    int updateByExample(@Param("record") HouseHold record, @Param("example") HouseHoldExample example);

    int updateByPrimaryKeySelective(HouseHold record);

    int updateByPrimaryKey(HouseHold record);
}