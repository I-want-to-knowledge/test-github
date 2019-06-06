package com.ws.ob.demo;

import com.ws.ob.demo.chapter5.AspectJAnnotationDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@Slf4j
@SpringBootApplication(/*scanBasePackageClasses = HelloWorld.class*/)
public class TestGithubApplication {

	public static void main(String[] args) throws IOException {
		final ConfigurableApplicationContext context = SpringApplication.run(TestGithubApplication.class, args);
		assert (context != null);
		// log.info("The beans you were looking for:");
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(log::info);
		// final HelloWorld helloWorld = context.getBean(HelloWorld.class);
		// helloWorld.sayHi();

		// 需要执行的程序
		AspectJAnnotationDemo.execute(context);

		suspend();
		context.close();
	}

	/**
	 * 暂停程序，任意键结束暂停
	 * @throws IOException 异常
	 */
	private static void suspend() throws IOException {
		final int read = System.in.read();
		System.out.println("输入：" + read);
	}
}
