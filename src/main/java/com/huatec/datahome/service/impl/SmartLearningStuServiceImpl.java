package com.huatec.datahome.service.impl;

import com.huatec.datahome.dao.SmartLearningStuDao;
import com.huatec.datahome.domain.HuatecStudent;
import com.huatec.datahome.domain.LoginRecord;
import com.huatec.datahome.service.SmartLearningStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
@Service
public class SmartLearningStuServiceImpl implements SmartLearningStuService {

    @Autowired
    private SmartLearningStuDao stuDao;

    @Override
    public List<HuatecStudent> getBaseInfo() {
        return stuDao.getBaseInfo();
    }

    @Override
    public List<LoginRecord> getLoginNum() {
        return stuDao.getLoginNum();
    }

    @Override
    public int updateBaseInfo(List<HuatecStudent> baseInfo) {
        return stuDao.updateBaseInfo(baseInfo);
    }

    @Override
    public int updateLoginNum(List<LoginRecord> loginNum) {
        return stuDao.updateLoginNum(loginNum);
    }
}