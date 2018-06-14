package com.cms.view;

import com.cms.dao.BookingDao;
import com.cms.dao.BookingDaoImpl;
import com.cms.dao.BookingHelperDao;
import com.cms.dao.BookingHelperDaoImpl;
import com.cms.dao.CabDao;
import com.cms.dao.CabDaoImpl;
import com.cms.dao.CustomerDao;
import com.cms.dao.CustomerDaoImpl;
import com.cms.entity.Booking;
import com.cms.entity.Cab;
import com.cms.entity.Customer;
import com.cms.service.BookCab;
import com.cms.service.ChangeStatus;


public class MainView {

	public static void main(String[] args) {
	
	/*	--- Unit Testing of Customer
		//Customer customer1 = new Customer(691736, "Prashant Chaubey");
		Customer customer1 = new Customer(691740, "Deepak Bisht");
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.addCustomer(customer1);
		
		
		--- Unit Testing of Cab
		Cab cab1 = new Cab(103,"Aman Hooda");
		CabDao cabDao = new CabDaoImpl();
		cabDao.addCab(cab1);
		
		*/
		
		//Booking book1 = new Booking();
		//BookCab bookCab = new BookCab();
		//bookCab.bookCab(book1, 8, 691736);
		/* 
		
	        
	    
		
			ChangeStatus changeStatus = new ChangeStatus();
			changeStatus.updateStatus(101, true);
			changeStatus.updateStatus(102, true);
			changeStatus.updateStatus(103, true);
			
			
			
			BookingHelperDao bookinghelper = new BookingHelperDaoImpl();
		System.out.println(bookinghelper.getBookingId());
*/
			
		
	        BookCab bookcab = new BookCab();
	       
	        bookcab.bookCab(9, 691740);
	        bookcab.bookCab(4, 691743);
	        bookcab.bookCab(3, 691732);
	        

		
	}
}


