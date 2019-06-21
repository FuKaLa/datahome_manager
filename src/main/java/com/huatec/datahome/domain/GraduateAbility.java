package com.huatec.datahome.domain;

/**
 * Created by Administrator on 2019/6/21.
 */
public class GraduateAbility {

    private String ability;
    private Integer abilityValue;
    private String majorName;
    private String type;

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getAbilityValue() {
        return abilityValue;
    }

    public void setAbilityValue(Integer abilityValue) {
        this.abilityValue = abilityValue;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
