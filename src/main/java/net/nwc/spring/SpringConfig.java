package net.nwc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("net.nwc.*")
@Import(JavaConfig.class)
@ImportResource("classpath:net/nwc/spring/spring.xml")
public class SpringConfig {

}
