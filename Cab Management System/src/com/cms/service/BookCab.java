package com.cms.service;

import com.cms.dao.BookingDao;
import com.cms.dao.BookingDaoImpl;
import com.cms.dao.BookingHelperDao;
import com.cms.dao.BookingHelperDaoImpl;
import com.cms.dao.CabDao;
import com.cms.dao.CabDaoImpl;
import com.cms.entity.Booking;


public class BookCab {
	
	
		public void bookCab(int distance, int customerId){
			
			BookingHelperDao  bookinghelperdao = new BookingHelperDaoImpl();
			
			
			CabDao cabDao = new CabDaoImpl();
			int cabId = cabDao.getCabId();
			
			if(cabId!=0) {
				
				Booking book = new Booking();
				bookinghelperdao.setBookingId();//increamenting id in db
				book.setBookingId(bookinghelperdao.getBookingId());//fetching id from db
				
				book.setDistance(distance);
				book.setCustomerId(customerId);
				
				book.setCabId(cabId);
				
				if(distance>10) {book.setBillingAmount(305 + (distance-10)*25);}
				else if (distance <10 & distance>5) {
					
					book.setBillingAmount(180 + (distance-5)*25);
				}
				else if (distance <5 & distance>1) {
					
					book.setBillingAmount(100 + (distance-1)*20);
				}
				else 	book.setBillingAmount(100);
				
				// invoke doa methods
				//update booking details to the db
				BookingDao bookingdao = new BookingDaoImpl();
				bookingdao.addBooking(book);
				
				// change status of that cab 
				ChangeStatus changeStatus = new ChangeStatus();

				changeStatus.updateStatus(book.getCabId(),false);

			
			}else
			{System.out.println("Booking is not confirmed, Since no cabs are available at the moment.");}
			
			
			
			
			
		}

		
}
