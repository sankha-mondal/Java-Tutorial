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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;
import com.service.UserService;




@RestController
@RequestMapping("users")	// http://localhost:8081/products/
@CrossOrigin			    // Enable cors policies 
public class UserController {

	@Autowired
	UserService userService;
	

	
	//  Retrieve Operation:-
	
	// http://localhost:8585/users/findAll
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> findAllUser() {
		return userService.findAllUser();
	}
	
	
	
	//  Insert Operation:-
	
	// http://localhost:8585/users/storeUser
	@PostMapping(value = "storeUser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeUser(@RequestBody User user) {
		return userService.storeUser(user);
	}

	
	
	//  Update Operation:-
	
	//  http://localhost:8585/users/updateUser
	@PutMapping(value = "updateUser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	
	
	//  Delete Operation:-
	
	//   http://localhost:8585/users/deleteUser/{uid}
	@DeleteMapping(value = "deleteUser/{uid}")
	public String deleteUser(@PathVariable("uid") int uid) {
		return userService.deleteUser(uid);
	}
	
	
	
	//  Retrieve data by Id Operation:-
	
	//  http://localhost:8585/users/findUserById/{uId}
	@GetMapping(value = "findUserById/{uId}")
	public String findUserById(@PathVariable("uId") int uId) {
		return userService.findUserById(uId);
	}
	
	
	
	//  Retrieve data by Email Operation:-
	
	//  http://localhost:8585/users/findUserByEmail/{uEmail}
	@GetMapping(value = "findUserByEmail/{uEmail}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> findUserByEmail(@PathVariable("uEmail") String uEmail){
		return userService.findUserByEmail(uEmail);
	}
	
	
	
	//  User defined | Query: Order By User Id asc/desc:-
	
	//  http://localhost:8585/users/sortUserById
	@GetMapping(value = "sortUserById",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> sortUserById(){
		return userService.sortUserById();
	}
	
	
	//  User defined | Query: Record deleted by Email:-
	
	//  http://localhost:8585/users/deleteUserByEmail/{uEmail}
	@DeleteMapping(value = "deleteUserByEmail/{uEmail}")
	public String deleteUserByEmail(@PathVariable("uEmail") String uEmail) {
		return userService.deleteUserByEmail(uEmail);
	}
	
	
	
	
	/**
	//  User defined | Query: Find product based on condition :-
	
	//  http://localhost:8081/products/findProductByPrice/{price}
	@GetMapping(value = "findProductByPrice/{price}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findProductByPrice(@PathVariable("price") float price){
		return productService.findProductByPrice(price);
	}
	*/
	
	
}


