package com.cp.service;

import com.cp.entity.po.TtlProductInfoPo;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author ChengPeng
 * @create 2019-11-06 9:56
 */
public interface TtlProductInfoService {

    List<TtlProductInfoPo> listProduct(Map<String,Object> map);

    void export(HttpServletResponse response,String fileName);
}
