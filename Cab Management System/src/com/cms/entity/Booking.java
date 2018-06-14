package com.cms.entity;


public class Booking {
		
		private int distance;
		private static int bookingId;
		private int cabId;
		private int customerId;
		private int billingAmount;
		
		
		public static int getBookingId() {
			return bookingId;
		}


		public void setBookingId(int bookingId) {
			Booking.bookingId = bookingId;
		}


		public int getDistance() {
			return distance;
		}


		public void setDistance(int distance) {
			this.distance = distance;
		}


		public int getCabId() {
			return cabId;
		}


		public void setCabId(int cabId) {
			this.cabId = cabId;
		}


		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public int getBillingAmount() {
			return billingAmount;
		}


		public void setBillingAmount(int billingAmount) {
			this.billingAmount = billingAmount;
		}

			
				
}
