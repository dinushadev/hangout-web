package com.dns.hangout.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dns.framework.domain.BaseDomain;

@Entity
public class User extends BaseDomain{

	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public User(Long userId, String displyName) {
		super();
		this.userId = userId;
		this.fName = displyName;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="uid")
	private Long userId;
	
	
	private String email;
	
	private String fName;
	
	private String lName;
	
	private int isActive;
	
	private int gpsVisibility;

	
	private List<User> friends;
	
	private List<HangOut> hangOuts;
	
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getIsActive() {
		return isActive;
	}


	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}


	public int getGpsVisibility() {
		return gpsVisibility;
	}


	public void setGpsVisibility(int gpsVisibility) {
		this.gpsVisibility = gpsVisibility;
	}


	public List<User> getFriends() {
		return friends;
	}


	public void setFriends(List<User> friends) {
		this.friends = friends;
	}


	@Column(name="uname")
	private String uName;
	
	@Column(name="pass")
	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	


	public List<HangOut> getHangOuts() {
		return hangOuts;
	}


	public void setHangOuts(List<HangOut> hangOuts) {
		this.hangOuts = hangOuts;
	}
	
	
	
}
