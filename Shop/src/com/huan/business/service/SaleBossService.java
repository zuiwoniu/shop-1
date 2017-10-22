package com.huan.business.service;

import com.huan.tool.PageModel;

public class SaleBossService implements ISaleBossService {

	private ISaleBossService saleBossDao;
	@Override
	public PageModel listSaleBoss() {
		// TODO Auto-generated method stub
		return saleBossDao.listSaleBoss();
	}

	@Override
	public boolean addSaleBoss() {
		// TODO Auto-generated method stub
		return saleBossDao.addSaleBoss();
	}

	@Override
	public boolean delSaleBoss() {
		// TODO Auto-generated method stub
		return saleBossDao.delSaleBoss();
	}

	@Override
	public boolean updSaleBoss() {
		// TODO Auto-generated method stub
		return saleBossDao.updSaleBoss();
	}

	public ISaleBossService getSaleBossDao() {
		return saleBossDao;
	}

	public void setSaleBossDao(ISaleBossService saleBossDao) {
		this.saleBossDao = saleBossDao;
	}

}
