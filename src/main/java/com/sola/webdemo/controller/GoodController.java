package com.sola.webdemo.controller;

import com.sola.webdemo.entity.Good;
import com.sola.webdemo.service.Good.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{goodId}")
    @ResponseBody
    public Good getGood(@PathVariable(name = "goodId") Integer goodId) {
        return goodService.getGood(goodId);
    }

}
