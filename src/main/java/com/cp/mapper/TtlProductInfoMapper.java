package com.cp.mapper;

import com.cp.entity.po.TtlProductInfoPo;

import java.util.List;
import java.util.Map;

/**
 * @author ChengPeng
 * @create 2019-11-06 9:47
 */
public interface TtlProductInfoMapper {

    List<TtlProductInfoPo> listProduct(Map<String,Object> map);
}
