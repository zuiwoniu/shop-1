package com.huan.business.service;

import com.huan.business.dao.IOrderDao;
import com.huan.tool.PageModel;

public class OrderService implements IOrderService {

	private IOrderDao orderDao;
	@Override
	public PageModel listOrder() {
		// TODO Auto-generated method stub
		return orderDao.listOrder();
	}

	@Override
	public boolean addOrder() {
		// TODO Auto-generated method stub
		return orderDao.addOrder();
	}

	@Override
	public boolean delOrder() {
		// TODO Auto-generated method stub
		return orderDao.delOrder();
	}

	@Override
	public boolean updOrder() {
		// TODO Auto-generated method stub
		return orderDao.updOrder();
	}

	public IOrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(IOrderDao orderDao) {
		this.orderDao = orderDao;
	}

}
