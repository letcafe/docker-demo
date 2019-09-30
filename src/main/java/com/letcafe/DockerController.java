package com.letcafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    private static final Logger log = LoggerFactory.getLogger(DockerController.class);

    @RequestMapping("/")
    public String index() {
        log.info("Hello Docker!");
        return "Hello Docker!";
    }

    @RequestMapping("/param1")
    public String param1() {
        log.info("param1");
        return "param1";
    }

    @RequestMapping("/param2")
    public String param2() {
        log.info("param2");
        return "param2";
    }
}
