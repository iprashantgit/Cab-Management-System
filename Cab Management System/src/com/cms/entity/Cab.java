package com.cms.entity;

public class Cab {
	
		private int cabId;
		private String driverName;
		private boolean avalability;
		
		
		public Cab(int cabId, String driverName) {
			this.cabId = cabId;
			this.driverName = driverName;
			this.avalability = true;
		}

		public int getCabId() {
			return cabId;
		}
		
		public String getDriverName() {
			return driverName;
		}
		
		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}
		
		public boolean isAvalability() {
			return avalability;
		}

		public void setAvalability(boolean avalability) {
			this.avalability = avalability;
		}

		@Override
		public String toString() {
			return "Cab [cabId=" + cabId + ", driverName=" + driverName + ", avalability=" + avalability + "]";
		}

		
		
		
		
		
}
