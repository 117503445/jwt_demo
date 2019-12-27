package com.example.jwt_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 事例 控制器
 */
@RestController
public class HelloController {
    // 需要 jwt 的方法 , 需要 user 权限
    @GetMapping("/funcWithJwt")
    public String funcWithJwt() {
        return "hello funcWithJwt!";
    }

    //不需要 jwt 的方法 , 需要 user 权限
    @GetMapping("/funcWithoutJwt")
    public String funcWithoutJwt() {
        return "hello funcWithoutJwt!";
    }

    //需要 jwt 的方法 , 需要 admin 权限
    @GetMapping("/admin")
    public String admin() {
        return "hello admin !";
    }
}
