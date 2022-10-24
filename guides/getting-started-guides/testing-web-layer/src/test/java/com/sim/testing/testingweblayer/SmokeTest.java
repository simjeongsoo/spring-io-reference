package com.sim.testing.testingweblayer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController controller;  // test 메소드가 실행되기 전에 주입

    @Test
    void contextLoads() throws Exception{
        //--Context가 Controller를 생성하고 있음을 확인하는 테스트--//
        Assertions.assertThat(controller).isNotNull();
    }

}
