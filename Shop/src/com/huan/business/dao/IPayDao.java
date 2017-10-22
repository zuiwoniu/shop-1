package com.huan.business.dao;

import com.huan.tool.PageModel;

public interface  IPayDao {
	
	public PageModel listPayProduct();
	
	public boolean addPayProduct();
	
	public boolean delPayProduct();
	
	public boolean updPayProduct();
	
}
