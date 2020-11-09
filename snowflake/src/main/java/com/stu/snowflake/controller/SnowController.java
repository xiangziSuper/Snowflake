package com.stu.snowflake.controller;

import com.stu.snowflake.service.SnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lwx
 * @Description
 */
@RestController
public class SnowController {
    @Autowired
    SnowService snowService;

    @GetMapping("/snow")
    public String snow() {
        return snowService.getIDBySnowFlake();
    }
}
