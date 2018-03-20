package com.sola.webdemo;

import com.sola.webdemo.kafka.Producer;
import com.sola.webdemo.kafka.SampleMessage;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = "com.sola.webdemo.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    public ApplicationRunner runner(Producer producer) {
        producer.send(new SampleMessage(1, "A simple test message"));
        return null;
    }

}
