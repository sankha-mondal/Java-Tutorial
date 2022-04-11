package com.service;

import java.util.List;

import com.bean.MagicOfBook;
import com.dao.MagicOfBookDAO;

public class MagicOfBookSERVICE {
	
	
	//	Logic for Insert data:-   									[Operation-1]
	public String storeMagicOfBook(MagicOfBook mgb) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();		
			if(mb.storeMagicOfBook(mgb)>0) 
				return "Record inserted successfully.";
			else 
				return "Record didn't store.";
			
	}
	
	
	//	Logic for Delete data:-										[Operation-2]
	public String deleteMagicOfBook(int id) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.deleteMagicOfBook(id)>0) 
				return "Record deleted successfully.";
			 else 
				return "Record is not present.";	
	}
		
	
	//	Logic for Update data:-										[Operation-3]
	//  Update Book Name											[Operation-3A]
	public String updateMagicOfBookName(MagicOfBook mgb) {
			
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.updateMagicOfBookName(mgb)>0) {					
				return "Record update successfully";
			} else {
				return "Record is not updated or Record is not found";
			}
		}
	
	
	//  Update Author Name											[Operation-3B]
	public String updateMagicOfBookAuthorName(MagicOfBook mgb) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.updateMagicOfBookAuthorName(mgb)>0) {				
				return "Record update successfully";
			} else {
				return "Record not update";
			}
		}
	
	
	//  Update Book Genre											[Operation-3C]
	public String updateMagicOfBookGenre(MagicOfBook mgb) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.updateMagicOfBookGenre(mgb)>0) {				
				return "Record update successfully";
			} else {
				return "Record not update";
			}
		}
	
	
	//  Update Book Price											[Operation-3D]
	public String updateMagicOfBookPrice(MagicOfBook mgb) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.updateMagicOfBookPrice(mgb)>0) {					
				return "Record update successfully";
			} else {
				return "Record not update";
			}
		}
		
	
	//  Update Book SoldCopies										[Operation-3E]
	public String updateMagicOfBooksoldCopies(MagicOfBook mgb) {
		
			MagicOfBookDAO mb = new MagicOfBookDAO();
			if(mb.updateMagicOfBooksoldCopies(mgb)>0) {				
				return "Record update successfully";
			} else {
				return "Record not update";
			}
		}
	
	
	//	Logic for Retrieve All Books Name:-							[Operation-4]
	//  Logic in MagicOfBookMAIN.java file

	//	Logic for See the total count of the books 					[Operation-5]
	//  Logic in MagicOfBookMAIN.java file
	
	//	Logic for Retrieve All Name by Autobiography genre:-		[Operation-6]				
	public List<String> findAutobiographyBooks() {
		
			MagicOfBookDAO md = new MagicOfBookDAO();
			return md.findAutobiographyBooks();
	}
	
	
	//	Logic for Retrieve All data in price low->high order:-		[Operation-7]
	public List<MagicOfBook> priceLowtoHigh() {
		
			MagicOfBookDAO md = new MagicOfBookDAO();
			return md.priceLowtoHigh();
	}
	
	
	//	Logic for Retrieve All data in price high->low order:-		[Operation-8]
	public List<MagicOfBook> priceHightoLow() {
		
			MagicOfBookDAO md = new MagicOfBookDAO();
			return md.priceHightoLow();
	}
	
	
	//	Logic for Retrieve All data in best Selling order:-			[Operation-9]
	public List<MagicOfBook> bestSelling() {
		
			MagicOfBookDAO md = new MagicOfBookDAO();
			return md.bestSelling();
	}
	
}
