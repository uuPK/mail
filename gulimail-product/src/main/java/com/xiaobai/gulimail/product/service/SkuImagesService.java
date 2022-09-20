package com.xiaobai.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaobai.common.utils.PageUtils;
import com.xiaobai.gulimail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author xiaobai
 * @email xiaobai@gmail.com
 * @date 2022-09-20 14:05:05
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

