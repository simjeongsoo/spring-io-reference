package com.sim.testing.testingweblayer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // 테스트 환경에서 충돌을 방지하는 데 유용
public class HttpRequestTest {

    @LocalServerPort
    private int port;   // @LocalServerPort로 포트를 주입하는 것에 유의

    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    void greetingShouldReturnDefaultMessage() throws Exception{
        //--애플리케이션 동작 테스트--//
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" +
                port + "/", String.class)).contains("Hello, World");
    }
}
