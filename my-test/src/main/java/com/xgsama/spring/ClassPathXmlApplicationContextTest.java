package com.xgsama.spring;

import com.xgsama.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassPathXmlApplicationContextTest
 *
 * @author xgSama
 * @date 2021/3/16 22:37
 */
public class ClassPathXmlApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		System.out.println("context 启动成功");

		// 从 context 中取出我们的 Bean
		 User user = context.getBean(User.class);
		// 这句将输出: hello world
		System.out.println(user);
	}
}
