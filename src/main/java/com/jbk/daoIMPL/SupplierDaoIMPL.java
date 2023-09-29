package com.jbk.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dao.SupplierDao;
import com.jbk.entity.Supplier;

@Repository
public class SupplierDaoIMPL implements SupplierDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public Boolean addSupplier(Supplier suplier) {
		Boolean isAdd=false;
		Session session=null;
		try {
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			session.save(suplier);
			tr.commit();
			isAdd=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null) {
				session.close();
			}
				
		}
	
		
		return isAdd;
	}

	@Override
	public Boolean updateSupplier(Supplier suplier) {
		Boolean isUpdated=false;
		Session session=null;
		try {
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			session.update(suplier);
			tr.commit();
			isUpdated=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null) {
				session.close();
			}
				
		}
	
		
		return isUpdated;
	}

	@Override
	public Boolean deleteSupplier(Supplier suplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier SuppgetSupplierByName(String supplierName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier getSupplierByMobile(String mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

}
