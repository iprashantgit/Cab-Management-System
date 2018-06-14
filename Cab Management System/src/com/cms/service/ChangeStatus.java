package com.cms.service;

import com.cms.dao.CabDao;
import com.cms.dao.CabDaoImpl;

public class ChangeStatus {

	public void updateStatus(int cabId, boolean toChange) {
		
		CabDao cabDao = new CabDaoImpl();
		cabDao.changeCabStatus(cabId, toChange);
		
		
	}
	
	
}
