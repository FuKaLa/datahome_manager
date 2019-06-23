package com.huatec.datahome.dao;

import com.huatec.datahome.domain.CourseResources;
import com.huatec.datahome.domain.HuatecTeacher;
import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.RequiredBoutiqueCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
@Repository
@Mapper
public interface SmartLearningTeaDao {

    /**
     * 智慧学习基础
     */
    List<HuatecTeacher> getBaseInfo();
    /**
     * 精品必修
     */
    List<RequiredBoutiqueCourse> getJpbxNum();
    /**
     * 课程信息
     *
     */
    List<MajorBasic> getCourseNum();
    /**
     * 数字化资源占比
     *
     */
    List<CourseResources> getSzhzyNum();

    /**
     * 智慧学习基础
     */
    int updateBaseInfo(@Param("baseInfo") List<HuatecTeacher> baseInfo);
    /**
     * 精品必修
     */
    int updateJpbxNum(@Param("jpbxNum") List<RequiredBoutiqueCourse> jpbxNum);

    /**
     * 课程信息
     *
     */
    int updateCourseNum(@Param("courseNum") List<MajorBasic> courseNum);
    /**
     * 数字化资源占比
     *
     */
    int UpdateSzhzyNum(@Param("szhzyNum") List<CourseResources> szhzyNum);

}
