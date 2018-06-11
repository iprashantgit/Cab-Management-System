package com.cms.view;

import com.cms.dao.BookingDao;
import com.cms.dao.BookingDaoImpl;
import com.cms.dao.CabDao;
import com.cms.dao.CabDaoImpl;
import com.cms.dao.CustomerDao;
import com.cms.dao.CustomerDaoImpl;
import com.cms.entity.Booking;
import com.cms.entity.Cab;
import com.cms.entity.Customer;
import com.cms.service.BookCab;


public class MainView {

	public static void main(String[] args) {
	
	/*	--- Unit Testing of Customer
		//Customer customer1 = new Customer(691736, "Prashant Chaubey");
		Customer customer1 = new Customer(691740, "Deepak Bisht");
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.addCustomer(customer1);
		
		
		--- Unit Testing of Cab
		Cab cab1 = new Cab(101,"Satendra Singh");
		CabDao cabDao = new CabDaoImpl();
		cabDao.addCab(cab1);
		
		*/
		
		Booking book1 = new Booking();
		BookCab bc = new BookCab();
		book1 = bc.bookCab(book1, 8, 691736);
		
		
		BookingDao bookingDao = new BookingDaoImpl();
		bookingDao.addBooking(book1);
	}

}
