package com.sola.webdemo.controller;

import com.sola.webdemo.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: Json
 * @author: SolaSJ@qq.com
 * @create: 2018/03/21 17:45
 **/
@Controller
public class JsonController {

    @PostMapping(value = "/json")
    @ResponseBody
    public String getStringNoBlank(String json) {
        return new JsonUtil().getStringNoBlank(json);
    }
}
