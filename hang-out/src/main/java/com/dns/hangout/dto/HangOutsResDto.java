package com.dns.hangout.dto;

import java.util.List;

import com.dns.hangout.domain.HangOut;

public class HangOutsResDto extends CommonResDto{
	
	private List<HangOut> hangouts;

	public List<HangOut> getHangouts() {
		return hangouts;
	}

	public void setHangouts(List<HangOut> hangouts) {
		this.hangouts = hangouts;
	}
	
	

}
