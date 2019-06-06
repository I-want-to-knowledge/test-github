package com.ws.ob.demo.chapter5;

import org.springframework.context.ApplicationContext;

/**
 * 面向方面编程
 *
 * @author YanZhen
 * @since 2019-06-06 17:24
 */
public class AspectJAnnotationDemo {
  private AspectJAnnotationDemo() {
  }

  public static void execute(ApplicationContext context) {
    final NewDocumentarist newDocumentarist = context.getBean("newDocumentarist", NewDocumentarist.class);
    newDocumentarist.execute();
  }
}
