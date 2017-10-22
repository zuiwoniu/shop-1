package com.huan.business.dao;

import com.huan.tool.PageModel;

public interface  IOrderDao {
	
	public PageModel listOrder();
	
	public boolean addOrder();
	
	public boolean delOrder();
	
	public boolean updOrder();
	
}
