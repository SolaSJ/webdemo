package com.sola.webdemo.config;

import com.sola.webdemo.Interceptor.LoginAuthInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class MvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginAuthInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
