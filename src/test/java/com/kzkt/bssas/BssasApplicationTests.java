package com.kzkt.bssas;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@MapperScan({"com.kzkt.bsaas.Mapper"})
@SpringBootTest
class BssasApplicationTests {

    @Test
    void contextLoads() {
    }

}
