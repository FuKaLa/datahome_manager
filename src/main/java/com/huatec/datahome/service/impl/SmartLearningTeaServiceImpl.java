package com.huatec.datahome.service.impl;

import com.huatec.datahome.dao.SmartLearningTeaDao;
import com.huatec.datahome.domain.CourseResources;
import com.huatec.datahome.domain.HuatecTeacher;
import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.RequiredBoutiqueCourse;
import com.huatec.datahome.service.SmartLearningTeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
@Service
public class SmartLearningTeaServiceImpl implements SmartLearningTeaService{

    @Autowired
    private SmartLearningTeaDao teaDao;

    @Override
    public List<HuatecTeacher> getBaseInfo() {
        return teaDao.getBaseInfo();
    }

    @Override
    public List<RequiredBoutiqueCourse> getJpbxNum() {
        return teaDao.getJpbxNum();
    }

    @Override
    public List<MajorBasic> getCourseNum() {
        return teaDao.getCourseNum();
    }

    @Override
    public List<CourseResources> getSzhzyNum() {
        return teaDao.getSzhzyNum();
    }

    @Override
    public int updateBaseInfo(List<HuatecTeacher> getBaseInfo) {
        return teaDao.updateBaseInfo( getBaseInfo);
    }

    @Override
    public int updateJpbxNum(List<RequiredBoutiqueCourse> getJpbxNum) {
        return teaDao.updateJpbxNum(getJpbxNum);
    }

    @Override
    public int updateCourseNum(List<MajorBasic> getCourseNum) {
        return teaDao.updateCourseNum(getCourseNum);
    }

    @Override
    public int UpdateSzhzyNum(List<CourseResources> getSzhzyNum) {
        return teaDao.UpdateSzhzyNum(getSzhzyNum);
    }
}
