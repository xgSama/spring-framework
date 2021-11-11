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
		testLifeCycle2();
	}

	public static void testLifeCycle1() {
		String xml = "beans.xml";
		System.out.println("现在开始初始化容器");

		ApplicationContext factory = new ClassPathXmlApplicationContext(xml);
		System.out.println("容器初始化成功");
		//得到Person，并使用
		Person person = factory.getBean("person", Person.class);
		System.out.println(person);

		for (String beanDefinitionName : factory.getBeanDefinitionNames()) {
			System.out.println("----- " + beanDefinitionName);
		}

		System.out.println("现在开始关闭容器！");
		((ClassPathXmlApplicationContext) factory).registerShutdownHook();
	}

	// https://blog.csdn.net/cool_summer_moon/article/details/106149339?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162996745016780357218539%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=162996745016780357218539&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-106149339.pc_search_similar&utm_term=bean%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F&spm=1018.2226.3001.4187
	public static void testLifeCycle2() {
		System.out.println("Spring容器初始化===========================");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

		System.out.println("Spring容器初始化完毕========================");

		System.out.println("从容器中获取Bean");
		IocBeanLifeService service = context.getBean("iocBeanLifeService", IocBeanLifeService.class);

		System.out.println(service.toString());

		System.out.println("Spring容器准备关闭==========================");
		context.close();
		System.out.println("Spring容器完成关闭===========================");
	}
}
