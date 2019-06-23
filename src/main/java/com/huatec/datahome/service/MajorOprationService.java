package com.huatec.datahome.service;

import com.huatec.datahome.domain.MajorEmploymentRate;
import com.huatec.datahome.domain.ProjectorBackground;
import com.huatec.datahome.domain.TitlePageNum;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public interface MajorOprationService {

    /**
     * 专业运营基础
     */
    int updateBaseInfo(List<TitlePageNum> baseInfo );
    /**
     * 专业就业率
     */
    int updateMajorRate(List<MajorEmploymentRate> majorRate);

    /**
     * 工程师行业背景人数，
     */
    int updateBackgroundNum(List<ProjectorBackground> backgroundNum);

    /**
     * 专业运营基础
     */
    List<TitlePageNum> getBaseInfo();
    /**
     * 专业就业率
     */
    List<MajorEmploymentRate> getMajorRate();

    /**
     * 工程师行业背景人数，
     */
    List<ProjectorBackground> getBackgroundNum();

}
