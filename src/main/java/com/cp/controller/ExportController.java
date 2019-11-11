package com.cp.controller;

import com.cp.service.TtlProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 * @author ChengPeng
 * @create 2019-11-06 10:18
 */
@RestController
@RequestMapping("/excelUtils")
public class ExportController {

    @Autowired
    private TtlProductInfoService productInfoService;

    @GetMapping("/export")
    public void export(HttpServletResponse response){
        this.productInfoService.export(response,"商品信息" + new Random().nextInt(1000));

    }
}
