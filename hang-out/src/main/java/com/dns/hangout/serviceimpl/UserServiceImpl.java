package com.dns.hangout.serviceimpl;

import java.util.List;

import com.dns.hangout.dao.UserDAO;
import com.dns.hangout.domain.User;
import com.dns.hangout.dto.FrindSearchReqDto;
import com.dns.hangout.dto.FrindUsersReqDto;
import com.dns.hangout.service.UserService;

public class UserServiceImpl implements UserService{

	
	private UserDAO userDao;

	public void addNewUser(User user) {

		userDao.addUser(user);
	}
	

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllFriendByUser(FrindSearchReqDto frndSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByEmail(FrindUsersReqDto frndSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
