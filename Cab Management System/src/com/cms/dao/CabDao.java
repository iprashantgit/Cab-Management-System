package com.cms.dao;

import com.cms.entity.Cab;

public interface CabDao {
	
	public void addCab(Cab cab);

	public int getCabId();
	
	public void changeCabStatus(int cabId, boolean i);
}
