package com.example.demologging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestMain {
    Logger logger = LoggerFactory.getLogger(LogTestMain.class);
    @RequestMapping("/")
    public String home(){
        logger.info("This page is be private");
//        logger.error("This page should be private");
        return "This is my main page";
    }
}
