package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.jbk.entity.Supplier;
import com.jbk.serviceIMPL.SupplierServiceIMPL;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	SupplierServiceIMPL service;
	
	@PostMapping("/addSupplier")
	public ResponseEntity<Boolean> addSupplier(@RequestBody Supplier suplier) {
		Boolean isAdded = service.addSupplier(suplier);
		if(isAdded) {
			return new ResponseEntity<>(isAdded,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<Boolean>(isAdded,HttpStatus.ALREADY_REPORTED);
		}
		
	}
	@PutMapping("/updateSupplier")
	public ResponseEntity<Boolean> updateSupplier(@RequestBody Supplier supplier) {
		Boolean isUpdate = service.updateSupplier(supplier);
		if(isUpdate) {
			return new ResponseEntity<>(isUpdate,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Boolean>(isUpdate,HttpStatus.NO_CONTENT);
		}
	}
	public Boolean deleteSupplier(Supplier suplier) {
		return null;
	}
	public Supplier SuppgetSupplierByName(String supplierName) {
		return null;
	}
	public Supplier getSupplierByMobile(String mobileNumber) {
		return null;
	}
	public List<Supplier> getAllSupplier() {
		return null;
	}
	
	
	

}
