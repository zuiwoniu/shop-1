package com.huan.business.dao;

import com.huan.tool.PageModel;

public interface  IProductTypeDao {
	
	public PageModel listProductType();
	
	public boolean addProductType();
	
	public boolean delProductType();
	
	public boolean updProductType();
	
}
