package com.huatec.datahome.domain;

import java.util.List;

/**
 * Created by Administrator on 2019/6/21.
 */
public class MajorAnalysisDO {

    private String type;

    /**
     * 获取专业数量
     *
     * @return 所有专业名称
     */
    /**
     * 获取基本信息
     */
    private List<MajorBasic> majorBasic;
    /**
     * 获取专业每年高职本科数量
     * 不维护
     */

    /**
     * 双创产品分析
     * 不维护
     */
    /**
     * 就业岗位数量分布
     */
    private List<Common1> employmentNum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MajorBasic> getMajorBasic() {
        return majorBasic;
    }

    public void setMajorBasic(List<MajorBasic> majorBasic) {
        this.majorBasic = majorBasic;
    }

    public List<Common1> getEmploymentNum() {
        return employmentNum;
    }

    public void setEmploymentNum(List<Common1> employmentNum) {
        this.employmentNum = employmentNum;
    }
}
