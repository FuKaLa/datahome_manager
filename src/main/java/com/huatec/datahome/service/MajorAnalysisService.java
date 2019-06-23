package com.huatec.datahome.service;

import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.MajorEmployment;
import com.huatec.datahome.utils.R;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public interface MajorAnalysisService {

    int updateMajorBasic(List<MajorBasic> majorBasics);

    //修改就业岗位数量分布
    int updateMajorEmployment(List<MajorEmployment> majorEmployments);


    List<MajorBasic> getMajorBasic(String majorName);

    //获取就业岗位数量分布
    List<MajorEmployment> getMajorEmployment(String majorName);

    }





