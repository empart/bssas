package com.kzkt.bssas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.kzkt.bssas.Mapper"})
@SpringBootApplication
public class BssasApplication {

    public static void main(String[] args) {
        SpringApplication.run(BssasApplication.class, args);
    }

}
