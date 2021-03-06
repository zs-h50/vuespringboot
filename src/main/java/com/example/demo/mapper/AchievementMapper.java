package com.example.demo.mapper;

import com.example.demo.pojo.Achievement;
import com.example.demo.pojo.AchievementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AchievementMapper {
    long countByExample(AchievementExample example);

    int deleteByExample(AchievementExample example);

    int deleteByPrimaryKey(Long aId);

    int insert(Achievement record);

    int insertSelective(Achievement record);

    List<Achievement> selectByExample(AchievementExample example);

    Achievement selectByPrimaryKey(Long aId);

    int updateByExampleSelective(@Param("record") Achievement record, @Param("example") AchievementExample example);

    int updateByExample(@Param("record") Achievement record, @Param("example") AchievementExample example);

    int updateByPrimaryKeySelective(Achievement record);

    int updateByPrimaryKey(Achievement record);
    
    List<Achievement> GetAll();
    
    List<Achievement> GetSome(String data);
    
    List<Achievement> GetTeacherExam(String account);
    
    List<Achievement> GetStudentExam(String account);
    
    List<Achievement> GetStudentExamSearch(String account,String result);
    
    List<Achievement> GetStudentExamSearchOne(String account,String aSemester);
    
    int DeleteAchievement(Long cId);
    
    List<Achievement> getOneAchievement(Long sId,Long cId);
    
    List<Achievement> StudentExam(String cNo,String classname);
    
    int DeleteExam(Long aId);
}