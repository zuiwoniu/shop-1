package com.huan.business.po;

import java.math.BigDecimal;

/**
 * SUsers entity. @author MyEclipse Persistence Tools
 */

public class SUsers implements java.io.Serializable {

	// Fields

	private Long userId;
	private BigDecimal userPass;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userAddress;
	private BigDecimal userMoney;
	private Boolean userCondition;

	// Constructors

	/** default constructor */
	public SUsers() {
	}

	/** full constructor */
	public SUsers(BigDecimal userPass, String userName, String userPhone, String userEmail, String userAddress,
			BigDecimal userMoney, Boolean userCondition) {
		this.userPass = userPass;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userMoney = userMoney;
		this.userCondition = userCondition;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getUserPass() {
		return this.userPass;
	}

	public void setUserPass(BigDecimal userPass) {
		this.userPass = userPass;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public BigDecimal getUserMoney() {
		return this.userMoney;
	}

	public void setUserMoney(BigDecimal userMoney) {
		this.userMoney = userMoney;
	}

	public Boolean getUserCondition() {
		return this.userCondition;
	}

	public void setUserCondition(Boolean userCondition) {
		this.userCondition = userCondition;
	}

}