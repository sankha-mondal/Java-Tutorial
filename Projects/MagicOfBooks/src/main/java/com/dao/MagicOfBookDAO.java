package com.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.MagicOfBook;

public class MagicOfBookDAO {
	
		//	Insert data Operation:-       								[Operation-1]
		public int storeMagicOfBook(MagicOfBook mgb) {
				try {
				// create session factory
				Configuration con = new Configuration();		//  Create configuration con
				con.configure("hibernate.cfg.xml");			//  driver loaded successfully
				SessionFactory sf = con.buildSessionFactory();		// like a Connection con 

				//create session
				Session session = sf.openSession();			
				//start a transaction
				Transaction tran = session.getTransaction();
				
				tran.begin();						// start a transaction
					session.save(mgb);				// save the Employee object
				tran.commit();						// commit transaction
				return 1;
				}
				catch (Exception e) {
					System.err.println(e);
				}
				return 0;
		}
		
		
		//	Delete data Operation:-    								 	[Operation-2]	
		public int deleteMagicOfBook(int id) {
			
				// create session factory		
				Configuration con = new Configuration();		
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();		
				
				//create session
				Session session = sf.openSession();			
				//start a transaction		
				Transaction tran = session.getTransaction();
					
				MagicOfBook e = session.get(MagicOfBook.class, id);	
				/* id is used because here we delete data 
					based upon the id*/
				if(e == null) {
					return 0;
				} else {
					tran.begin();
						session.delete(e);
					tran.commit();
					return 1;
				}
			}
		
		
		// 	Update data Operation:-     								[Operation-3]
		//  Update Book Name Operation:-								[Operation-3A]
		public int updateMagicOfBookName(MagicOfBook mgb) {
			
				Configuration con = new Configuration();		
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();		
				Session session = sf.openSession();				
				Transaction tran = session.getTransaction();
				
				MagicOfBook e = session.get(MagicOfBook.class, mgb.getId());	
				if(e == null) {
					return 0;
				} else {
					tran.begin();
						e.setName(mgb.getName());
						session.update(e);
					tran.commit();
					return 1;
				}
		}
		
		
		//  Update Author Name Operation:-								[Operation-3B]
		public int updateMagicOfBookAuthorName(MagicOfBook mgb) {
			
			Configuration con = new Configuration();		
			con.configure("hibernate.cfg.xml");			
			SessionFactory sf = con.buildSessionFactory();		
			Session session = sf.openSession();				
			Transaction tran = session.getTransaction();
			
			MagicOfBook e = session.get(MagicOfBook.class, mgb.getId());	
			if(e == null) {
				return 0;
			} else {
				tran.begin();
					e.setAuthorName(mgb.getAuthorName());
					session.update(e);
				tran.commit();
				return 1;
			}
		}
		
		
		//  Update Book Genre Operation:-								[Operation-3C]
			public int updateMagicOfBookGenre(MagicOfBook mgb) {
				
				Configuration con = new Configuration();		
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();		
				Session session = sf.openSession();				
				Transaction tran = session.getTransaction();
				
				MagicOfBook e = session.get(MagicOfBook.class, mgb.getId());	
				if(e == null) {
					return 0;
				} else {
					tran.begin();
						e.setGenre(mgb.getGenre());
						session.update(e);
					tran.commit();
					return 1;
				}
			}
		
		
		//  Update Book Price Operation:-								[Operation-3D]
		public float updateMagicOfBookPrice(MagicOfBook mgb) {
			
			Configuration con = new Configuration();		
			con.configure("hibernate.cfg.xml");			
			SessionFactory sf = con.buildSessionFactory();		
			Session session = sf.openSession();				
			Transaction tran = session.getTransaction();
			
			MagicOfBook e = session.get(MagicOfBook.class, mgb.getId());	
			if(e == null) {
				return 0;
			} else {
				tran.begin();
					e.setPrice(mgb.getPrice());
					session.update(e);
				tran.commit();
				return 1;
			}
		}
		
		
		//  Update Book SoldCopies Operation:-							[Operation-3E]
		public float updateMagicOfBooksoldCopies(MagicOfBook mgb) {
			
			Configuration con = new Configuration();		
			con.configure("hibernate.cfg.xml");			
			SessionFactory sf = con.buildSessionFactory();		
			Session session = sf.openSession();				
			Transaction tran = session.getTransaction();
			
			MagicOfBook e = session.get(MagicOfBook.class, mgb.getId());	
			if(e == null) {
				return 0;
			} else {
				tran.begin();
					e.setSoldCopies(mgb.getSoldCopies());
					session.update(e);
				tran.commit();
				return 1;
			}
		}
		
		
		// Retrieve only one property e.g Name for all id:-   			[Operation-4]
		//  Logic in MagicOfBookMAIN.java file
		
		
		//	To See the total count of the books 						[Operation-5]
		//  Logic in MagicOfBookMAIN.java file
		
		
		// Retrieve only one property BookNames for all id:-   			[Operation-6]
			public List<String> findAutobiographyBooks() {
					
					Configuration con = new Configuration();
					con.configure("hibernate.cfg.xml");			
					SessionFactory sf = con.buildSessionFactory();	
					Session session = sf.openSession();	
					
					Query qry = session.createQuery("select mob.name from MagicOfBook mob where genre='Autobiography'");   	// HQl Query
					List<String> listOfBooksName = qry.list();
					return listOfBooksName;
				}	
		
			
		// Arrange the book in price low to high order:-  				[Operation-7]
			public List<MagicOfBook> priceLowtoHigh() {
					
					Configuration con = new Configuration();
					con.configure("hibernate.cfg.xml");			
					SessionFactory sf = con.buildSessionFactory();	
					Session session = sf.openSession();	
					
					Query qry = session.createQuery("from MagicOfBook mob order by mob.price asc");		// HQl Query
					List<MagicOfBook> priceLowtoHigh = qry.list();
					return priceLowtoHigh;
				}
	
			
		// Arrange the book in price low to high order:-  				[Operation-8]
			public List<MagicOfBook> priceHightoLow() {
					
					Configuration con = new Configuration();
					con.configure("hibernate.cfg.xml");			
					SessionFactory sf = con.buildSessionFactory();	
					Session session = sf.openSession();	
					
					Query qry = session.createQuery("from MagicOfBook mob order by mob.price desc");		// HQl Query
					List<MagicOfBook> priceLowtoHigh = qry.list();
					return priceLowtoHigh;
				}
	
			
		// Arrange the book in price low to high order:-  				[Operation-9]
			public List<MagicOfBook> bestSelling() {
				
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();	
				Session session = sf.openSession();	
				
				Query qry = session.createQuery("from MagicOfBook mob order by mob.price desc");		// HQl Query
				List<MagicOfBook> priceLowtoHigh = qry.list();
				return priceLowtoHigh;
			}
				
}
