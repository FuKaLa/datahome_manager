package com.huatec.datahome.service;

import com.huatec.datahome.domain.CourseResources;
import com.huatec.datahome.domain.HuatecTeacher;
import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.RequiredBoutiqueCourse;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
public interface SmartLearningTeaService {
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
    int updateBaseInfo(List<HuatecTeacher> getBaseInfo);
    /**
     * 精品必修
     */
    int updateJpbxNum(List<RequiredBoutiqueCourse> getJpbxNum);

    /**
     * 课程信息
     *
     */
    int updateCourseNum(List<MajorBasic> getCourseNum);
    /**
     * 数字化资源占比
     *
     */
    int UpdateSzhzyNum(List<CourseResources> getSzhzyNum);

}
