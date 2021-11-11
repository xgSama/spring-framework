package com.xgsama.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * CustomerBeanPostProcessor
 *
 * @author : xgSama
 * @date : 2021/8/26 18:33:33
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【步骤10】执行BeanPostProcessor中postProcessBeforeInitialization方法,beanName=" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【步骤14】执行BeanPostProcessor的postProcessAfterInitialization方法,beanName=" + beanName);
		return bean;
	}
}
