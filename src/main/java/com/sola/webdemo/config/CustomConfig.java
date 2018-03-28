package com.sola.webdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sola.custom")
@Data
public class CustomConfig {

    private String url;

    private String port;

}
