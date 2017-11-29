/**
 * Copyright @ 2017北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2017/11/17 15:28
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright @ 2017北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title HelloController
 * @Project spring-cloud-demo
 * @Description TODO
 * @author wangqiang
 * @date 2017/11/17 15:28
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
