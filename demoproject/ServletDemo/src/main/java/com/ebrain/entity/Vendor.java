package com.ebrain.entity;

public class Vendor {


	    private String vendorId;
		private String vendorName;
		private String phone;
		private String vendorEmail;
		private String address;
		
		
		
		
		public Vendor(String vendorId, String vendorName, String phone, String vendorEmail, String address) {
			super();
			this.vendorId = vendorId;
			this.vendorName = vendorName;
			this.phone = phone;
			this.vendorEmail = vendorEmail;
			this.address = address;
		}
		public String getVendorId() {
			return vendorId;
		}
		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}
		public String getVendorName() {
			return vendorName;
		}
		public void setVendorName(String vendorName) {
			this.vendorName = vendorName;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getVendorEmail() {
			return vendorEmail;
		}
		public void setVendorEmail(String vendorEmail) {
			this.vendorEmail = vendorEmail;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		
		
		
		
}

		