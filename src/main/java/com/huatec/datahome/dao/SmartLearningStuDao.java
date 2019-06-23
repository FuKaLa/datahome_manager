package com.huatec.datahome.dao;

import com.huatec.datahome.domain.HuatecStudent;
import com.huatec.datahome.domain.LoginRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
@Repository
@Mapper
public interface SmartLearningStuDao {

    List<HuatecStudent> getBaseInfo();

    List<LoginRecord> getLoginNum();

    /**
     * 智慧学习基础
     */
    int updateBaseInfo(@Param("baseInfo") List<HuatecStudent> baseInfo);

    /**
     * 接入方式占比
     */
    int updateLoginNum(@Param("loginNum") List<LoginRecord> loginNum);

}
