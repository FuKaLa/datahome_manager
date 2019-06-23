package com.huatec.datahome.service.impl;

import com.huatec.datahome.dao.MajorAnalysisDao;
import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.MajorEmployment;
import com.huatec.datahome.service.MajorAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
@Service
public class MajorAnalysisServiceImpl implements MajorAnalysisService {

    @Autowired
    private MajorAnalysisDao majorAnalysisDao;


    @Override
    public int updateMajorBasic(List<MajorBasic> majorBasics) {
        return majorAnalysisDao.updateMajorBasic( majorBasics);
    }

    @Override
    public int updateMajorEmployment(List<MajorEmployment> majorEmployments) {
        return majorAnalysisDao.updateMajorEmployment(majorEmployments);
    }

    @Override
    public List<MajorBasic> getMajorBasic(String majorName) {
        return majorAnalysisDao.getMajorBasic( majorName);
    }

    @Override
    public List<MajorEmployment> getMajorEmployment(String majorName) {
        return majorAnalysisDao.getMajorEmployment( majorName);
    }
}
