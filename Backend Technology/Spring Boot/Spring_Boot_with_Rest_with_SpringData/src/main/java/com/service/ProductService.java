package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	//  Retrieve Operation:-
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	
	//  Insert Operation:-
	
	public String storeProduct(Product product) {
			boolean result = productRepository.existsById(product.getPid());
			if(result) {
				return "Product didn't store. Pid must be unique";
			} else {
				productRepository.save(product);
				return "Product stored successfully";
			}
	}
	
	
	//  Update Operation:-
	
	public String updateProduct(Product product) {
		Optional<Product> op =  productRepository.findById(product.getPid());
			if(op.isPresent()) {
					Product p = op.get();
					p.setPrice(product.getPrice());
					productRepository.saveAndFlush(p);
					return "Product updated successfully";
			} else {
				return "Product not present";
			}
		}
	
	
	//  Delete Operation:-
	
	public String deleteProduct(int pid) {
		Optional<Product> op =  productRepository.findById(pid);
			if(op.isPresent()) {
					Product p = op.get();
					productRepository.delete(p);
					return "Product deleted successfully";
			} else {
				return "Product not present";
			}
		}
	
	
	
	//  Retrieve data by Id Operation:-
	
	public Product findProductById(int pid) {
		Optional<Product> op =  productRepository.findById(pid);
			if(op.isPresent()) {
					Product p = op.get();
					return p;
			} else {
				return null;
			}
		}
	
	
	
	//  User defined | Query: Find product based on condition :-
	
	public List<Product> findProductByPrice(float price){
		return productRepository.findProductByPrice(price);
	}
	
	
	
	//  User defined | Query: Order By product asc/desc:-
	
	public List<Product> sortProductByPrice() {
		return productRepository.sortByPrice();
	}
	
	
	
	//  User defined | Query: Record deleted by name
	
	public String deleteProductByName(String pname) {
		if(productRepository.deleteProductByName(pname)>0) {
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	
}


