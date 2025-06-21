package com.ruoyi.university.mapper;

import com.ruoyi.university.domain.CersUserRecommendRel;
import com.ruoyi.university.domain.Major;
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
public interface CersUserRecommendRelMapper {

    List<RecommendMajor> getRecommendList(@Param("userId") Long userId);

    /**
     * 删除用户的推荐记录
     * @param userId 用户ID
     * @return 影响行数
     */
    int deleteUserRecommendations(@Param("userId") String userId);

    /**
     * 插入用户推荐记录
     * @param params 推荐记录参数
     * @return 影响行数
     */
    int insertUserRecommendation(Map<String, Object> params);


    /**
     * 根据ID查询记录
     */
    CersUserRecommendRel selectById(String id);

    /**
     * 查询上一条记录
     */
    CersUserRecommendRel selectPreviousOrder(@Param("belong") String belong, @Param("relOrder") Long relOrder);

    /**
     * 查询下一条记录
     */
    CersUserRecommendRel selectNextOrder(@Param("belong") String belong, @Param("relOrder") Long relOrder);

    /**
     * 更新记录排序值
     */
    int updateOrder(@Param("order") CersUserRecommendRel order);

    int updateLockStatus(@Param("id") String id);

    List<CersUserRecommendRel> getByUserId(@Param("userId") Long userId);

    Integer batchDeleteByIDs(@Param("list") List<CersUserRecommendRel> collect);

    Integer batchInsert(@Param("list") List<CersUserRecommendRel> all95);

    CersUserRecommendRel getById(@Param("id") String id);

    int deleteById(@Param("id") String id);

    List<CersUserRecommendRel> getByBelong(@Param("belong") String belong);

    int batchUpdateMajorOrders(List<CersUserRecommendRel> updateParams);
}
