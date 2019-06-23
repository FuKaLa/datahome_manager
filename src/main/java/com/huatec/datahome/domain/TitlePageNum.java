package com.huatec.datahome.domain;

/**
 * Created by dingjiatian on 2019/6/23.
 */
public class TitlePageNum {

    private String name;
    //'支持人员- 研发人员数量'
    private Integer dataUndergraduate;
    //'支撑人员-设计人员数量'
    private Integer dataVocational;
    //1：合作院校、运营团队、支撑人员
    private Integer pageTitleNum;

    private Integer dataOther;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDataUndergraduate() {
        return dataUndergraduate;
    }

    public void setDataUndergraduate(Integer dataUndergraduate) {
        this.dataUndergraduate = dataUndergraduate;
    }

    public Integer getDataVocational() {
        return dataVocational;
    }

    public void setDataVocational(Integer dataVocational) {
        this.dataVocational = dataVocational;
    }

    public Integer getPageTitleNum() {
        return pageTitleNum;
    }

    public void setPageTitleNum(Integer pageTitleNum) {
        this.pageTitleNum = pageTitleNum;
    }

    public Integer getDataOther() {
        return dataOther;
    }

    public void setDataOther(Integer dataOther) {
        this.dataOther = dataOther;
    }
}
