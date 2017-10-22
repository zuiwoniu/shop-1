package com.huan.business.service;

import com.huan.business.dao.IManageDao;
import com.huan.tool.PageModel;

public class ManageService implements IManageService {

	private IManageDao manageDao;
	@Override
	public PageModel listManage() {
		// TODO Auto-generated method stub
		return manageDao.listManage();
	}

	@Override
	public boolean addManage() {
		// TODO Auto-generated method stub
		return manageDao.addManage();
	}

	@Override
	public boolean delManage() {
		// TODO Auto-generated method stub
		return manageDao.delManage();
	}

	@Override
	public boolean updManage() {
		// TODO Auto-generated method stub
		return manageDao.updManage();
	}

	public IManageDao getManageDao() {
		return manageDao;
	}

	public void setManageDao(IManageDao manageDao) {
		this.manageDao = manageDao;
	}

}
