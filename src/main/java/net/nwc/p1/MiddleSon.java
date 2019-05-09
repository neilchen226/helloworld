package net.nwc.p1;

import org.springframework.stereotype.Component;

@Component
public class MiddleSon implements SonBean {

	@Override
	public String outSon() {
		return "middle son";
	}

}
