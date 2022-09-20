package com.xiaobai.gulimail.product.dao;

import com.xiaobai.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaobai
 * @email xiaobai@gmail.com
 * @date 2022-09-20 14:05:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
