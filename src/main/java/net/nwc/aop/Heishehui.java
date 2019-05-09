package net.nwc.aop;

import javax.annotation.PostConstruct;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * �����
 */
@Aspect
@Component
public class Heishehui {

	@Pointcut("execution(** net.nwc.aop.Laobaixing.zuoshengyi(..))")
	public void findLaobaixing() {
	}

	@Before("findLaobaixing()")
	public void findingLaoBaixing() {
		System.out.println("���Ǻ���ᣬ���ڿ�gai����û���ϰ���������");
	}

	@After("findLaobaixing()")
	public void shoubaohuifei() {
		System.out.println("���Ǻ���ᣬ�ҿ����˸��ϰ��������⣬ȥ�ձ�����");
	}

	@PostConstruct
	public void init() {
		System.out.println("���Ǻ���ᣬ�ҿ�ʼ�����ˡ�");
	}

}
