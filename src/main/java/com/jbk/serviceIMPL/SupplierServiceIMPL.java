package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.daoIMPL.SupplierDaoIMPL;
import com.jbk.entity.Supplier;
import com.jbk.service.SupplierService;

@Service
public class SupplierServiceIMPL implements SupplierService {
	
	@Autowired
	SupplierDaoIMPL dao;

	@Override
	public Boolean addSupplier(Supplier suplier) {
		
		return dao.addSupplier(suplier);
	}

	@Override
	public Boolean updateSupplier(Supplier suplier) {
		
		return dao.updateSupplier(suplier);
		
	}

	@Override
	public Boolean deleteSupplier(Supplier suplier) {
		
		return dao.deleteSupplier(suplier);
	}

	@Override
	public Supplier SuppgetSupplierByName(String supplierName) {
		
		return dao.SuppgetSupplierByName(supplierName);
	}

	@Override
	public Supplier getSupplierByMobile(String mobileNumber) {
		
		return dao.getSupplierByMobile(mobileNumber);
	}

	@Override
	public List<Supplier> getAllSupplier() {
		
		return dao.getAllSupplier();
	}

}
