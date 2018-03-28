package com.sola.webdemo.controller;

import com.sola.webdemo.entity.Good;
import com.sola.webdemo.service.good.IGoodService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: GoodController
 * @author: SolaSJ@qq.com
 * @create: 2018/03/16 16:47
 **/
@Controller
@RequestMapping(value = "/good")
public class GoodController {

    @Autowired
    private IGoodService goodService;

    @RequestMapping(value = "/{goodId}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取商品信息")
    public Good getGood(@ApiParam(value = "商品Id") @PathVariable(name = "goodId") Integer goodId) {
        return goodService.getGood(goodId);
    }

}
