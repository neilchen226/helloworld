package net.nwc.aop;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * ���˵�
 */
@Component
public class Maicaidi implements Laobaixing {

	@PostConstruct
	public void init() {
		System.out.println("�������˵Σ���׼��ȥ�����ˡ�");
	}

	@Override
	public void zuoshengyi() {
		System.out.println("�������˵Σ��ҿ�ʼ������");
	}

}
