package com.huan.business.dao;

import com.huan.tool.PageModel;

public interface  IBuyerDao {
	
	public PageModel listBuyer();
	
	public boolean addBuyer();
	
	public boolean delBuyer();
	
	public boolean updBuyer();
	
}
