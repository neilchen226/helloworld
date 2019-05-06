package net.nwc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import net.nwc.p.SpringJavaBean;

@Configuration
public class JavaConfig {

	@Bean
	@Profile("prod")
	public SpringJavaBean springJavaBean() {
		return new SpringJavaBean();

	}
}
