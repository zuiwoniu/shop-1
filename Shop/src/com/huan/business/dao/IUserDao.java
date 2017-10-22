package com.huan.business.dao;

import com.huan.tool.PageModel;

public interface  IUserDao {
	
	public PageModel listUser();
	
	public boolean addUser();
	
	public boolean delUser();
	
	public boolean updUser();
	
}
