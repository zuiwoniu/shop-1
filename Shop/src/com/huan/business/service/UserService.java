package com.huan.business.service;

import com.huan.business.dao.IUserDao;
import com.huan.tool.PageModel;

public class UserService implements IUserService {

	private IUserDao userDao;
	@Override
	public PageModel listUser() {
		// TODO Auto-generated method stub
		return userDao.listUser();
	}

	@Override
	public boolean addUser() {
		// TODO Auto-generated method stub
		return userDao.addUser();
	}

	@Override
	public boolean delUser() {
		// TODO Auto-generated method stub
		return userDao.delUser();
	}

	@Override
	public boolean updUser() {
		// TODO Auto-generated method stub
		return userDao.updUser();
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
