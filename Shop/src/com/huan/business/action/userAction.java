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
			this.addActionError("查询客户失败");
			return INPUT;
		}
		
	}
	
public String delUser(){
		if (userService.delUser()) {
			return "list";
		} else {
			this.addActionError("删除客户失败");
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
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public List<SUsers> getUsers() {
		return users;
	}
	public void setUsers(List<SUsers> users) {
		this.users = users;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}
	public PageBean getPage() {
		return page;
	}
	public void setPage(PageBean page) {
		this.page = page;
	}

}
