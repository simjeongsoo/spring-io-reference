package com.sim.testing.testingweblayer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")    // 모든 HTTP 작업 매핑
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }
}
