package net.nwc.p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlay implements MediaPlayer {
	@Autowired
	CompactDisc compactDisc;

	@Override
	public String play() {
		return compactDisc.getCdtype();
	}

}
