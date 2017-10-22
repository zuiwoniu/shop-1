package com.huan.business.service;

import com.huan.business.dao.IProductDao;
import com.huan.tool.PageModel;

public class ProduceService implements IProductService {
private IProductDao productDao;
	@Override
	public PageModel listUser() {
		// TODO Auto-generated method stub
		return productDao.listUser();
	}

	@Override
	public boolean addUser() {
		// TODO Auto-generated method stub
		return productDao.addUser();
	}

	@Override
	public boolean delUser() {
		// TODO Auto-generated method stub
		return productDao.delUser();
	}

	@Override
	public boolean updUser() {
		// TODO Auto-generated method stub
		return productDao.updUser();
	}

	public IProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

}
