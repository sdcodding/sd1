package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	
	@Id
	@Column(nullable = false,unique = true)
	private String supplierName;
	
	@Column(nullable = false,unique = true)
	private String supplierMobileNO;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(String supplierName, String supplierMobileNO) {
		super();
		this.supplierName = supplierName;
		this.supplierMobileNO = supplierMobileNO;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierMobileNO() {
		return supplierMobileNO;
	}
	public void setSupplierMobileNO(String supplierMobileNO) {
		this.supplierMobileNO = supplierMobileNO;
	}
	@Override
	public String toString() {
		return "Supplier [supplierName=" + supplierName + ", supplierMobileNO=" + supplierMobileNO + "]";
	}

}
