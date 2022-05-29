package com.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf; // it is equal to SessionFactory 
	
	//  Insert Operation:-
	
	public boolean storeProduct(Product product) {
		try {
			EntityManager manager = emf.createEntityManager();		// it is equal to session object 
			EntityTransaction tran = manager.getTransaction();		// it is equal to Transaction 
			tran.begin();
					manager.persist(product);                       // it is equal to session.save 
			tran.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
	//   Retrieve Operation:-
	
	public List<Product> getAllProduct() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select p from Product p");   // JPQL like a HQL 
		return qry.getResultList();										// qry.list();
	}
	
	
	
	//   Update Operation:-
	
	public boolean updateProduct(Product product) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p1 = manager.find(Product.class, product.getPid());     // session.get(Product.class,product.getId());
		if(p1==null) {
			return false;
		} else {
			tran.begin();
					p1.setPrice(product.getPrice());
					manager.persist(p1);                             // session.update(p1);
			tran.commit();
			return true;
		}
	}
	
	
	//   Delete operation:-
	
	public boolean deleteProduct(int pid) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p1 = manager.find(Product.class, pid);     // session.get(Product.class,product.getId());
		if(p1==null) {
			return false;
		} else {
			tran.begin();
					manager.remove(p1);                             // session.delete(p1);
			tran.commit();
			return true;
		}
	}
	
	
}


