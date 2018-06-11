package com.cms.service;

import com.cms.dao.CabDao;
import com.cms.dao.CabDaoImpl;
import com.cms.entity.Booking;

public class BookCab  {
		
	

		public Booking bookCab(Booking book, int distance, int customerId){
			
			
			CabDao cabdao = new CabDaoImpl();
			
			book.setDistance(distance);
			book.setCustomerId(customerId);
			book.setCabId(cabdao.getCabId()); 
			
			if(distance>10) {book.setBillingAmount(305 + (distance-10)*25);}
			else if (distance <10 & distance>5) {
				
				book.setBillingAmount(180 + (distance-5)*25);
			}
			else if (distance <5 & distance>1) {
				
				book.setBillingAmount(100 + (distance-1)*20);
			}
			else 	book.setBillingAmount(100);

			return book;
		}
		
		
		
}
