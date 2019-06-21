package com.huatec.datahome.domain;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
public class MajorOprationDO {

    /**
     * 专业运营基础
     * 职高 或 本科 （英文） + page_title_num
     */
    private List<Common2> baseInfo;
    /**
     * 专业就业率
     * rate + 名称缩写
     */
    private List<Common3> majorRate;

    /**
     * 工程师行业背景人数，
     * num + 专业名称缩写
     */
    private List<Common1> backgroundNum;

    public List<Common2> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<Common2> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<Common3> getMajorRate() {
        return majorRate;
    }

    public void setMajorRate(List<Common3> majorRate) {
        this.majorRate = majorRate;
    }

    public List<Common1> getBackgroundNum() {
        return backgroundNum;
    }

    public void setBackgroundNum(List<Common1> backgroundNum) {
        this.backgroundNum = backgroundNum;
    }
}
