package com.dns.hangout.daoimpl;

import com.dns.framework.dao.CommonHibernteDAO;
import com.dns.hangout.dao.UserDAO;
import com.dns.hangout.domain.User;

public class UserDAOImpl extends CommonHibernteDAO implements UserDAO{

	public User addUser(User user) {
		getHibernateTemplate().save(user);
		
		return null;
	}

}
