package net.nwc.aop;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * 卖菜滴
 */
@Component
public class Maicaidi implements Laobaixing {

	@PostConstruct
	public void init() {
		System.out.println("我是卖菜滴，我准备去卖菜了。");
	}

	@Override
	public void zuoshengyi() {
		System.out.println("我是卖菜滴，我开始卖菜啦");
	}

}
