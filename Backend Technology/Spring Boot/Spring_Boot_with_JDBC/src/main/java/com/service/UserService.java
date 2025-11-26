package com.service;

import com.model.User;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	private final UserRepository repo;

	public UserService(UserRepository repo) {
		this.repo = repo;
	}

	public List<User> getAll() {
		return repo.findAll();
	}

	public Optional<User> getById(Long id) {
		return repo.findById(id);
	}

	public int save(User user) {
		return repo.save(user);
	}

	public int update(Long id, User user) {
		return repo.update(id, user);
	}

	public int delete(Long id) {
		return repo.delete(id);
	}
}