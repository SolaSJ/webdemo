package com.sola.webdemo.controller;

import com.sola.webdemo.config.CustomConfig;
import com.sola.webdemo.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Json
 * @author: SolaSJ@qq.com
 * @create: 2018/03/21 17:45
 **/
@RestController
@Api(value = "/", tags = "Sola", description = "json操作接口")
public class JsonController {

    @Autowired
    private CustomConfig customConfig;

    @PostMapping(value = "/json")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "Invalid input")})
    public String getStringNoBlank(String json) {
        System.out.println(customConfig);
        return new JsonUtil().getStringNoBlank(json);
    }
}
