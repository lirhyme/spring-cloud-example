package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @HystrixCommand(fallbackMethod = "goodbye")
    public String greeting() {
        int a = 0 / 0;
        return "Hello User";
    }


    public String goodbye() {
        return "Goodbye";
    }
}
