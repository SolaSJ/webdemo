package com.sola.webdemo.service.impl.Good;

import com.sola.webdemo.entity.Good;
import com.sola.webdemo.mapper.GoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: Good服务类
 * @author: SolaSJ@qq.com
 * @create: 2018/03/16 14:18
 **/
@Service
public class GoodServiceImpl {

    @Autowired
    private GoodMapper goodMapper;

    public Good getGood(Good good) {
        good = goodMapper.selectByPrimaryKey(good);
        return good;
    }

}
