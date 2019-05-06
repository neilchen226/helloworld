package net.nwc.p;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CompactDisc {

	@Value("play CD's songs")
	private String cdtype;

	public String getCdtype() {
		return cdtype;
	}

	public void setCdtype(String cdtype) {
		this.cdtype = cdtype;
	}

}
