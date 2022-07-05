package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	//  Retrieve Operation:-
	
	public List<User> findAllUser() {
		return userRepository.findAll();
	}
	
	
	//  Insert Operation:-
	
	public String storeUser(User user) {
			boolean result = userRepository.existsById(user.getuId());   
			//System.out.println(result);
			if(result) {
				return "User didn't store. Id must be unique";
			} else {
				userRepository.save(user);
				return "User stored successfully";
			}
	}
	
	
	//  Update Operation:-
	
	public String updateUser(User user) {
		Optional<User> op =  userRepository.findById(user.getuId());
			if(op.isPresent()) {
				User u = op.get();
				u.setuPassword(user.getuPassword());
				userRepository.saveAndFlush(u);
				return "User updated successfully";
			} else {
				return "User not present";
			}
		}
	
	
	//  Delete Operation:-
	
	public String deleteUser(int uid) {
		Optional<User> op =  userRepository.findById(uid);
			if(op.isPresent()) {
					User u = op.get();
					userRepository.delete(u);
					return "User deleted successfully";
			} else {
				return "User not present";
			}
		}
	
	
	/**
	//  Retrieve data by Id Operation:-
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
	*/
	
}


