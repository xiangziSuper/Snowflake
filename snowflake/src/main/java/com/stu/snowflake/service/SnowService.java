package com.stu.snowflake.service;

import com.stu.snowflake.util.IdGeneratorSnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author lwx
 * @Description
 */
@Service
public class SnowService {
    @Autowired
    private IdGeneratorSnowFlake idGeneratorSnowFlake;

    public String getIDBySnowFlake(){
        ExecutorService executorService = Executors.newFixedThreadPool(20);


        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> {

                System.out.println(Thread.currentThread().getName()+"-"+idGeneratorSnowFlake.snowflakeId());
            });
        }
        executorService.shutdown();
        return "ok";

    }

}
