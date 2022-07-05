package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("products")	// http://localhost:8081/products/
@CrossOrigin			    // Enable cors policies 
public class ProductController {

	@Autowired
	ProductService productService;
	
	//@RequestMapping(value = "findAll",method = )  no need this here
	
	//  Retrieve Operation:-
	
	// http://localhost:8081/products/findAll
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct() {
		return productService.findAllProduct();
	}
	
	
	
	//  Insert Operation:-
	
	// http://localhost:8081/products/storeProduct
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProdcut(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	
	
	//  Update Operation:-
	
	//  http://localhost:8081/products/updateProduct
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	
	
	//  Delete Operation:-
	
	//   http://localhost:8081/products/deleteProduct/{pid}
	@DeleteMapping(value = "deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
	
	
	
	//  Retrieve data by Id Operation:-
	
	//  http://localhost:8081/products/findProductById/{pid}
	@GetMapping(value = "findProductById/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProductById(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
	
	
	
	//  User defined | Query: Find product based on condition :-
	
	//  http://localhost:8081/products/findProductByPrice/{price}
	@GetMapping(value = "findProductByPrice/{price}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findProductByPrice(@PathVariable("price") float price){
		return productService.findProductByPrice(price);
	}
	
	
	
	//  User defined | Query: Order By product asc/desc:-
	
	//  http://localhost:8081/products/sortProductByPrice
	@GetMapping(value = "sortProductByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> sortProductByPrice(){
		return productService.sortProductByPrice();
	}
	
	
	
	//   User defined | Query: Record deleted by name
	
	//  http://localhost:8081/products/deleteProductByName/{pname}
	@DeleteMapping(value = "deleteProductByName/{pname}")
	public String deleteProductByName(@PathVariable("pname") String pname) {
		return productService.deleteProductByName(pname);
	}
	
	
	
}


