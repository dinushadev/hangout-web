package com.dns.hangout.dto;

import java.util.List;

import com.dns.hangout.domain.User;

public class FriendListResDto extends CommonResDto{

	private List<User> friends;

	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	
	
}
