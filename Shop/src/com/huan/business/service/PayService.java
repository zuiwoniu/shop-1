package com.huan.business.service;

import com.huan.business.dao.IPayDao;
import com.huan.tool.PageModel;

public class PayService implements IPayService {

	private IPayDao payDao;
	@Override
	public PageModel listPayProduct() {
		// TODO Auto-generated method stub
		return payDao.listPayProduct();
	}

	@Override
	public boolean addPayProduct() {
		// TODO Auto-generated method stub
		return payDao.addPayProduct();
	}

	@Override
	public boolean delPayProduct() {
		// TODO Auto-generated method stub
		return payDao.delPayProduct();
	}

	@Override
	public boolean updPayProduct() {
		// TODO Auto-generated method stub
		return payDao.updPayProduct();
	}

	public IPayDao getPayDao() {
		return payDao;
	}

	public void setPayDao(IPayDao payDao) {
		this.payDao = payDao;
	}

}
