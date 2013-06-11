package com.dns.hangout.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dns.hangout.domain.User;
import com.dns.hangout.dto.FriendListResDto;
import com.dns.hangout.dto.FrindSearchReqDto;
import com.dns.hangout.dto.FrindUsersReqDto;
import com.dns.hangout.service.UserService;
@Controller
public class FriendsController {

	
private static final Logger logger = LoggerFactory.getLogger(FriendsController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/friendlist", method = RequestMethod.POST ,headers = "Accept=application/json")
	public @ResponseBody FriendListResDto friendList(@RequestBody FrindSearchReqDto frndSearch,  Model model) {
	
		FriendListResDto responce = new FriendListResDto();
		
		List<User>  friends =userService.getAllFriendByUser(frndSearch);
		friends =new ArrayList<User>();
		User kasun =new User(3l, "kasun");
		kasun.setEmail("kasun@gmail.com");
		kasun.setfName("Kasun");
		kasun.setlName("Chinthana");
		friends.add(kasun);
		
		User sadun =new User(4l, "Sadun");
		sadun.setEmail("sadun@email.com");
		sadun.setlName("Weerasekara");
		sadun.setfName("Sadun");
		friends.add(sadun);
		
		User aruna =new User(4l, "Aruna");
		aruna.setEmail("aruna@gamil.com");
		aruna.setlName("Kumara");
		aruna.setfName("Aruna");
		friends.add(aruna);
		
		User asela =new User(3l, "Asela");
		asela.setEmail("asela@gmai.com");
		asela.setfName("Asela");
		asela.setlName("Dematagoda");
		friends.add(asela);
		
		responce.setFriends(friends);
		return responce;
	}
	
	/**
	 * find friends
	 */
	@RequestMapping(value = "/searchUsers", method = RequestMethod.POST)
	public @ResponseBody FriendListResDto findFriends(@RequestBody FrindUsersReqDto frndSearch,  Model model) {
		FriendListResDto responce = new FriendListResDto();
		
		
		List<User>  friends =userService.getUsersByEmail(frndSearch);
		friends =new ArrayList<User>();
		
		
		User Chintana =new User(3l, "Chintana");
		Chintana.setEmail("Chintana@gmail.com");
		Chintana.setfName("Chintana");
		Chintana.setlName("Samaranayaka");
		friends.add(Chintana);
		
		User john =new User(4l, "John");
		john.setEmail("sadun@email.com");
		john.setlName("Weerasekara");
		john.setfName("John");
		friends.add(john);

		
		responce.setFriends(friends);
		return responce;
	}
}
