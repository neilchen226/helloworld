package net.nwc.p;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionBean.class)
public class ConditionSpringBean {
	public String out() {
		return "init";
	}
}
