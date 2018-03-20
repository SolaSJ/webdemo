package com.sola.webdemo.service.good.impl;

import com.sola.webdemo.entity.Good;
import com.sola.webdemo.mapper.GoodMapper;
import com.sola.webdemo.service.good.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: Good服务类
 * @author: SolaSJ@qq.com
 * @create: 2018/03/16 14:18
 **/
@Service
public class GoodServiceImpl implements IGoodService {

    @Autowired
    private GoodMapper goodMapper;

    public Good getGood(int goodId) {
        Good good = new Good();
        good.setGoodId(goodId);
        return goodMapper.selectByPrimaryKey(good);
    }

}
