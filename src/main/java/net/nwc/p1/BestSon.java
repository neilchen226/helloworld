package net.nwc.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestSon {

	@Autowired
	SonBean son;
	
	@Autowired
	@Qualifier("middleSon")
	SonBean qualifierSon;

	public SonBean getSon() {
		return son;
	}

	public SonBean getQualifierSon() {
		return qualifierSon;
	}
}
