package com.huan.business.action;

import java.util.List;

import com.huan.business.po.SUsers;
import com.huan.business.service.IUserService;
import com.huan.tool.PageBean;
import com.huan.tool.PageModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class userAction extends ActionSupport implements ModelDriven<SUsers>{

	private SUsers user = new SUsers();
	private IUserService userService;
	private List<SUsers> users;
	private PageModel pageModel;
	private PageBean page = new PageBean(1, 5);
	@SuppressWarnings("unchecked")
	public String listUser(){
		
		pageModel = userService.listUser();
		users = (List<SUsers>) pageModel.getObject();
		if (users != null) {
			return "list";
		} else {
			this.addActionError("²éÑ¯¿Í»§Ê§°Ü");
			return INPUT;
		}
		
	}
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
