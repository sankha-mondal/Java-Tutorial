package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

//=====================================================================================================

	// Fetch Op:
	// http://localhost:8080/api/users

	@GetMapping()
	public List<User> all() {
		return service.getAll();
	}

	// Fetch By Id Op:
	// http://localhost:8080/api/users/{id}

	@GetMapping("/{id}")
	public ResponseEntity<User> get(@PathVariable Long id) {
		return service.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

//===================================================================================================

	// Create Op:
	// http://localhost:8080/api/users
	/* {
	    "username": "john_doe",
	    "email": "john@example.com"
	 } */
	
	@PostMapping
	public ResponseEntity<Void> create(@RequestBody User user) {
		int rows = service.save(user);
		// For simplicity, return 201 if insert affected rows. In practice return
		// created resource URI.
		if (rows > 0) {
			return ResponseEntity.created(URI.create("/api/users")).build();
			// If insert successful → returns 1
			// If failed → returns 0
		}

		return ResponseEntity.badRequest().build();
	}

//==================================================================================================
	
	// Update Op:
	// http://localhost:8080/api/users/{id}
	/* {
	     "id": 1,
	    "username": "john_doe",
	    "email": "john@abc.com"
	 } */

	@PutMapping("/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
	    int rows = service.update(id, user);

	    if (rows > 0) {
	        // fetch updated user and return it as JSON
	        return service.getById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    return ResponseEntity.notFound().build();
	}


//=====================================================================================================
	
	// Delete Op:
	// http://localhost:8080/api/users/{id}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		int rows = service.delete(id);
		if (rows > 0)
			return ResponseEntity.noContent().build();
		return ResponseEntity.notFound().build();
	}

//=====================================================================================================
}