package com.huatec.datahome.dao;

import com.huatec.datahome.domain.MajorEmploymentRate;
import com.huatec.datahome.domain.ProjectorBackground;
import com.huatec.datahome.domain.TitlePageNum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dingjiatian on 2019/6/21.
 */
@Repository
@Mapper
public interface MajorOprationDao {

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

    /**
     * 专业运营基础
     */
    int updateBaseInfo(@Param("baseInfo") List<TitlePageNum> baseInfo );
    /**
     * 专业就业率
     */
    int updateMajorRate(@Param("majorRate") List<MajorEmploymentRate> majorRate);

    /**
     * 工程师行业背景人数，
     */
    int updateBackgroundNum(@Param("backgroundNum") List<ProjectorBackground> backgroundNum);

}
