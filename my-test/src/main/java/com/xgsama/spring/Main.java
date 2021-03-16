package com.xgsama.spring;

import com.xgsama.spring.config.SysConfig;
import com.xgsama.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author xgSama
 * @date 2021/3/16 16:23
 */
public class Main {
	public static void main(String[] args) {
		// 获取容器
		ApplicationContext ac =new AnnotationConfigApplicationContext(SysConfig.class);
		// 获取 bean
		User user = (User) ac.getBean("sysUser");
		System.out.println(user.toString());
	}
}
