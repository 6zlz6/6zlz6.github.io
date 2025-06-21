package com.ruoyi.university.mapper;

import com.ruoyi.university.domain.CersUserRecommendRel;
import com.ruoyi.university.domain.CersUserRecommendRelExclude;
import com.ruoyi.university.domain.RecommendMajor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* 用户-推荐志愿关系表 Mapper 接口
*
* @author none
* @since 2025-06-01
*/
@Mapper
public interface CersUserRecommendRelExcludeMapper {

    List<CersUserRecommendRelExclude> getExcludeRel(@Param("userId") Long userId);

    int add(CersUserRecommendRelExclude cersUserRecommendRelExclude);
}
