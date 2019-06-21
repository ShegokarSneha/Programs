package com.bridgelabz.ObjectOrientedPrograms;

import java.util.List;

	public class Product {
		
		String productname;
		List<ProductProperties> properties;
		
		public String getProductName() {
			return productname;
		}
		
		public void setProductName(String productname) {
			this.productname = productname;
		}
		
		public List<ProductProperties> getProperties() {
			return properties;
		}
		
		public void setProperties(List<ProductProperties> properties) {
			this.properties = properties;
		}
	}
	
