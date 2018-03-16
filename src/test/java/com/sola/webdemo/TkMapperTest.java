package com.sola.webdemo;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.sola.webdemo.entity.Good;
import com.sola.webdemo.mapper.GoodMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @description: TkMapper测试类
 * @author: SolaSJ@qq.com
 * @create: 2018/03/16 10:04
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TkMapperTest.class)
@MapperScan(basePackages = "com.sola.webdemo.mapper")
@EnableAutoConfiguration
public class TkMapperTest {

    private Log logger = LogFactory.getLog(TkMapperTest.class);

    @Autowired
    private GoodMapper goodMapper;

    @Test
    public void tkMapperTest() {
        Good good = new Good();
        good.setGoodId(3);
        good = goodMapper.selectByPrimaryKey(good);
        if (good != null)
            logger.info("tkMapperTest: " + good.toString());
    }

}
