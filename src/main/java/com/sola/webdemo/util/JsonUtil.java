package com.sola.webdemo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: Json工具类
 * @author: SolaSJ@qq.com
 * @create: 2018/03/21 16:52
 **/
public class JsonUtil {

    // 去除json中的换行符及空格
    public  String getStringNoBlank(String str) {
        if (str != null && !"".equals(str)) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            String strNoBlank = m.replaceAll("");
            return strNoBlank;
        } else {
            return str;
        }
    }

}
