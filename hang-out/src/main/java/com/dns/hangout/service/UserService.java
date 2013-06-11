package com.dns.hangout.service;

import java.util.List;

import com.dns.hangout.domain.User;
import com.dns.hangout.dto.FrindSearchReqDto;
import com.dns.hangout.dto.FrindUsersReqDto;

public interface UserService {

	void addNewUser(User user);

	List<User> getAllFriendByUser(FrindSearchReqDto frndSearch);

	List<User> getUsersByEmail(FrindUsersReqDto frndSearch);

}
