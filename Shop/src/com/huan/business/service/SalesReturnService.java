package com.huan.business.service;

import com.huan.business.dao.ISalesReturnDao;
import com.huan.tool.PageModel;

public class SalesReturnService implements ISalesReturnService {

	private ISalesReturnDao salesReturnDao;
	@Override
	public PageModel listSalesReturn() {
		// TODO Auto-generated method stub
		return salesReturnDao.listSalesReturn();
	}

	@Override
	public boolean addSalesReturn() {
		// TODO Auto-generated method stub
		return salesReturnDao.addSalesReturn();
	}

	@Override
	public boolean delSalesReturn() {
		// TODO Auto-generated method stub
		return salesReturnDao.delSalesReturn();
	}

	@Override
	public boolean updSalesReturn() {
		// TODO Auto-generated method stub
		return salesReturnDao.updSalesReturn();
	}

	public ISalesReturnDao getSalesReturnDao() {
		return salesReturnDao;
	}

	public void setSalesReturnDao(ISalesReturnDao salesReturnDao) {
		this.salesReturnDao = salesReturnDao;
	}

}
