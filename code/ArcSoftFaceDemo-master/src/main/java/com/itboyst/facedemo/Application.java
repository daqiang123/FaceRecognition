package com.itboyst.facedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.itboyst.facedemo.dao.mapper")
@EnableTransactionManagement
@RestController
public class Application {

    @RequestMapping(value = "/server")
    public Contributor demo() {
        Contributor contributor = new Contributor();
        contributor.login = "liuhq";
        contributor.contributions = 100;
        return contributor;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}

