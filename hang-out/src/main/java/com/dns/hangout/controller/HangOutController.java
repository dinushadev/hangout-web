package com.dns.hangout.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dns.hangout.domain.HangOut;
import com.dns.hangout.dto.FrindUsersReqDto;
import com.dns.hangout.dto.HangOutsResDto;
import com.dns.hangout.dto.HangoutReqDto;

@Controller
public class HangOutController {

	
	/**
	 * find my hangout
	 */
	@RequestMapping(value = "/hangout", method = RequestMethod.POST)
	public @ResponseBody HangOutsResDto getMyHangOut(@RequestBody HangoutReqDto hangoutSerch,  Model model) {
		HangOutsResDto responce = new HangOutsResDto();
		List<HangOut> hangouts = new ArrayList<HangOut>();
		
		HangOut hangOut1 = new HangOut();
		hangOut1.setId(2L);
		hangOut1.setHangOutTime(new Date(2013, 5, 20).getTime());
		hangOut1.setName("Brown Beach");
		hangouts.add(hangOut1);
		
		

		HangOut hangOut2 = new HangOut();
		hangOut2.setId(2L);
		hangOut2.setHangOutTime(new Date(2013, 6, 21).getTime());
		hangOut2.setName("Mount Beach");
		hangouts.add(hangOut2);
		

		HangOut hangOut3 = new HangOut();
		hangOut3.setId(2L);
		hangOut3.setHangOutTime(new Date(2013, 7, 2).getTime());
		hangOut3.setName("KFC-Nugegoda");
		hangouts.add(hangOut3);
		
		
		responce.setHangouts(hangouts);
		return responce;
	}
	

	/**
	 * find my friends hangout
	 */
	@RequestMapping(value = "/friendhangout", method = RequestMethod.POST)
	public @ResponseBody HangOutsResDto getMyFriendsHangOut(@RequestBody FrindUsersReqDto frndSearch,  Model model) {
		HangOutsResDto responce = new HangOutsResDto();
		
		
		
		return responce;
	}
}
