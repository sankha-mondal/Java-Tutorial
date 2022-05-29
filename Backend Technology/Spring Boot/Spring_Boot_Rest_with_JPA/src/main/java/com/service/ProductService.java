package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	//  Insert Operation:-
	
	public String storeProdcut(Product product) {
		if(productDao.storeProduct(product)) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	//  Retrieve Operation:-
	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
	
	
	//  Update Operation:-
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)) {
			return "Record updated successfully";
		} else {
			return "Record not present";
		}
	}
	
	
	//  Delete operation:-
	
	public String deleteProductInfo(int pid) {
		if(productDao.deleteProduct(pid)) {
			return "Product deleted successfully";
		} else {
			return "Product didn't delete";
		}
	}
	

	
	
	
	
}



