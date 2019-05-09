package net.nwc.aop;

import javax.annotation.PostConstruct;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 黑社会
 */
@Aspect
@Component
public class Heishehui {

	@Pointcut("execution(** net.nwc.aop.Laobaixing.zuoshengyi(..))")
	public void findLaobaixing() {
	}

	@Before("findLaobaixing()")
	public void findingLaoBaixing() {
		System.out.println("我是黑社会，我在看gai上有没有老百姓做生意");
	}

	@After("findLaobaixing()")
	public void shoubaohuifei() {
		System.out.println("我是黑社会，我看到了个老百姓做生意，去收保护费");
	}

	@PostConstruct
	public void init() {
		System.out.println("我是黑社会，我开始工作了。");
	}

}
