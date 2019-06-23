package com.huatec.datahome.service.impl;

import com.huatec.datahome.dao.MajorOprationDao;
import com.huatec.datahome.domain.MajorEmploymentRate;
import com.huatec.datahome.domain.ProjectorBackground;
import com.huatec.datahome.domain.TitlePageNum;
import com.huatec.datahome.service.MajorOprationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
@Service
public class MajorOprationServiceImpl implements MajorOprationService {

    @Autowired
    private MajorOprationDao majorOprationDao;



    @Override
    public int updateBaseInfo(List<TitlePageNum> baseInfo) {
        return majorOprationDao.updateBaseInfo(baseInfo);
    }

    @Override
    public int updateMajorRate(List<MajorEmploymentRate> majorRate) {
        return majorOprationDao.updateMajorRate(majorRate);
    }

    @Override
    public int updateBackgroundNum(List<ProjectorBackground> backgroundNum) {
        return majorOprationDao.updateBackgroundNum(backgroundNum);
    }

    @Override
    public List<TitlePageNum> getBaseInfo() {
        return majorOprationDao.getBaseInfo();
    }

    @Override
    public List<MajorEmploymentRate> getMajorRate() {
        return majorOprationDao.getMajorRate();
    }

    @Override
    public List<ProjectorBackground> getBackgroundNum() {
        return majorOprationDao.getBackgroundNum();
    }
}
