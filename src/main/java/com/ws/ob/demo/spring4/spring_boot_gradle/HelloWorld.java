package com.ws.ob.demo.spring4.spring_boot_gradle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot 测试类
 *
 * @author YanZhen
 * @since 2019-05-28 11:15
 */
@Slf4j
@RestController
public class HelloWorld {

  @RequestMapping("/")
  public String sayHi() {
    log.info("Hello World!");
    return "Hello World!";
  }
}
