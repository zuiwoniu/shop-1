package com.huan.business.service;

import com.huan.tool.PageModel;

public interface  IOrderService {
	
	public PageModel listOrder();
	
	public boolean addOrder();
	
	public boolean delOrder();
	
	public boolean updOrder();
	
}
