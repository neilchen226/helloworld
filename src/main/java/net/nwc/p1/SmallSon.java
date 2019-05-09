package net.nwc.p1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmallSon implements SonBean {

	@Override
	public String outSon() {
		// TODO Auto-generated method stub
		return "small son";
	}

}
