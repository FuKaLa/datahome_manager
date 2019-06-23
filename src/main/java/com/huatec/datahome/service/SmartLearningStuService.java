package com.huatec.datahome.service;

import com.huatec.datahome.domain.HuatecStudent;
import com.huatec.datahome.domain.LoginRecord;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
public interface SmartLearningStuService {

    List<HuatecStudent> getBaseInfo();

    List<LoginRecord> getLoginNum();


    /**
     * 智慧学习基础
     */
    int updateBaseInfo(List<HuatecStudent> baseInfo);

    /**
     * 接入方式占比
     */

    int updateLoginNum(List<LoginRecord> loginNum);


}
