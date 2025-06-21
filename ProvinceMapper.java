package com.ruoyi.university.mapper;

import com.ruoyi.university.domain.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 范佳兴
 * @date 2025/2/5 11:41
 */
@Mapper
public interface ProvinceMapper {
    /**
     * 获取所有省份高校统计信息
     *
     * @return 省份高校统计信息列表
     */
    List<Province> getAllProvinces();

    /**
     * 根据省份ID获取高校统计信息
     *
     * @param provinceId 省份ID
     * @return 省份高校统计信息
     */
    Province getProvinceById(Long provinceId);

    /**
     * 添加省份高校统计信息
     *
     * @param province 待添加的省份高校统计信息
     * @return 添加成功返回影响的行数，否则返回0
     */
    int addProvince(Province province);

    /**
     * 更新省份高校统计信息
     *
     * @param province 待更新的省份高校统计信息
     * @return 更新成功返回影响的行数，否则返回0
     */
    int updateProvince(Province province);

    /**
     * 删除省份高校统计信息
     *
     * @param provinceId 待删除的省份ID
     * @return 删除成功返回影响的行数，否则返回0
     */
    int deleteProvince(Long provinceId);
}
