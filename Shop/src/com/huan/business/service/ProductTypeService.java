package com.huan.business.service;

import com.huan.business.dao.IProductTypeDao;
import com.huan.tool.PageModel;

public class ProductTypeService implements IProductTypeService {

	private IProductTypeDao productTypeDao;
	@Override
	public PageModel listProductType() {
		// TODO Auto-generated method stub
		return productTypeDao.listProductType();
	}

	@Override
	public boolean addProductType() {
		// TODO Auto-generated method stub
		return productTypeDao.addProductType();
	}

	@Override
	public boolean delProductType() {
		// TODO Auto-generated method stub
		return productTypeDao.delProductType();
	}

	@Override
	public boolean updProductType() {
		// TODO Auto-generated method stub
		return productTypeDao.updProductType();
	}

	public IProductTypeDao getProductTypeDao() {
		return productTypeDao;
	}

	public void setProductTypeDao(IProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}

}
