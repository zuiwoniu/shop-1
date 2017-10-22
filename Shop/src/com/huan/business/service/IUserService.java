package com.huan.business.service;

import com.huan.tool.PageModel;

public interface  IUserService {

	public PageModel listUser();
	
	public boolean addUser();
	
	public boolean delUser();
	
	public boolean updUser();
}
