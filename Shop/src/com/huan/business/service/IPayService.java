package com.huan.business.service;

import com.huan.tool.PageModel;

public interface  IPayService {
	
	public PageModel listPayProduct();
	
	public boolean addPayProduct();
	
	public boolean delPayProduct();
	
	public boolean updPayProduct();
	
}
