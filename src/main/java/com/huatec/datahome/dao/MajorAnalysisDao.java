package com.huatec.datahome.dao;

import com.huatec.datahome.domain.MajorBasic;
import com.huatec.datahome.domain.MajorEmployment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
@Repository
@Mapper
public interface MajorAnalysisDao {

    List<MajorBasic> getMajorBasic(@Param("majorName") String majorName);

    //获取就业岗位数量分布
    List<MajorEmployment> getMajorEmployment(@Param("majorName") String majorName);


    int updateMajorBasic(@Param("majorBasics") List<MajorBasic> majorBasics);

    //修改就业岗位数量分布
    int updateMajorEmployment(@Param("majorEmployments") List<MajorEmployment> majorEmployments);

}
