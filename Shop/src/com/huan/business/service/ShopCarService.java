package com.huan.business.service;

import org.springframework.transaction.annotation.Transactional;

import com.huan.business.dao.IShopCarDao;
import com.huan.tool.PageModel;
@Transactional
public class ShopCarService implements IShopCarService {

	private IShopCarDao shopCarDao;
	@Override
	public PageModel listShopCar() {
		// TODO Auto-generated method stub
		return shopCarDao.listShopCar();
	}

	@Override
	public boolean addShopCar() {
		// TODO Auto-generated method stub
		return shopCarDao.addShopCar();
	}

	@Override
	public boolean delShopCar() {
		// TODO Auto-generated method stub
		return shopCarDao.delShopCar();
	}

	@Override
	public boolean updShopCar() {
		// TODO Auto-generated method stub
		return shopCarDao.updShopCar();
	}

	public IShopCarDao getShopCarDao() {
		return shopCarDao;
	}

	public void setShopCarDao(IShopCarDao shopCarDao) {
		this.shopCarDao = shopCarDao;
	}

}
