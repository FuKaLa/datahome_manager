package com.huatec.datahome.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class MajorOprationDO implements Serializable {

    /**
     * 专业运营基础
     * 职高 或 本科 （英文） + page_title_num
     */
    private List<TitlePageNum> baseInfo;
    /**
     * 专业就业率
     * rate + 名称缩写
     */
    private List<MajorEmploymentRate> majorRate;

    /**
     * 工程师行业背景人数，
     * num + 专业名称缩写
     */
    private List<ProjectorBackground> backgroundNum;

    public List<TitlePageNum> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<TitlePageNum> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<MajorEmploymentRate> getMajorRate() {
        return majorRate;
    }

    public void setMajorRate(List<MajorEmploymentRate> majorRate) {
        this.majorRate = majorRate;
    }

    public List<ProjectorBackground> getBackgroundNum() {
        return backgroundNum;
    }

    public void setBackgroundNum(List<ProjectorBackground> backgroundNum) {
        this.backgroundNum = backgroundNum;
    }
}
