package com.xgsama.spring.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanLifeCycle
 *
 * @author xgSama
 * @date 2021/3/26 17:08
 */
public class BeanLifeCycle {

	public static void main(String[] args) {
		String xml = "beans.xml";
		System.out.println("现在开始初始化容器");

		ApplicationContext factory = new ClassPathXmlApplicationContext(xml);
		System.out.println("容器初始化成功");
		//得到Person，并使用
		Person person = factory.getBean("person",Person.class);
		System.out.println(person);

		System.out.println("现在开始关闭容器！");
		((ClassPathXmlApplicationContext)factory).registerShutdownHook();
	}
}
