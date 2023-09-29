package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Supplier;

public interface SupplierDao {
	
	public Boolean addSupplier(Supplier suplier);
	public Boolean updateSupplier(Supplier suplier);
	public Boolean deleteSupplier(Supplier suplier);
	public Supplier SuppgetSupplierByName(String supplierName);
	public Supplier getSupplierByMobile(String mobileNumber);
	public List<Supplier> getAllSupplier();

}
