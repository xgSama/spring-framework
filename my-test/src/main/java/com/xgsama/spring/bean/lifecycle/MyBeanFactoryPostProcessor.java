package com.xgsama.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * MyBeanFactoryPostProcessor
 *
 * @author xgSama
 * @date 2021/3/26 17:04
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		super();
		System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {

		System.out.println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
		BeanDefinition bd = arg0.getBeanDefinition("person");
		bd.getPropertyValues().addPropertyValue("phone", "110");
	}

}
