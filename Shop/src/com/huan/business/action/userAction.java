package com.huan.business.action;

import com.huan.business.po.SUsers;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class userAction extends ActionSupport implements ModelDriven<SUsers>{

	private SUsers user = new SUsers();
	@Override
	public SUsers getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public SUsers getUser() {
		return user;
	}
	public void setUser(SUsers user) {
		this.user = user;
	}

}
