package com.xgsama.spring.config;

import com.xgsama.spring.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SysConfig
 *
 * @author xgSama
 * @date 2021/3/16 16:22
 */
@Configuration
public class SysConfig {

	@Bean
	public User sysUser() {
		return new User("zszxz", "123");
	}

}
