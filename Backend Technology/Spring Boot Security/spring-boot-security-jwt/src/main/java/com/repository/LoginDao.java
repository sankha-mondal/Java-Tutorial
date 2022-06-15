package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Login;


@Repository
public interface LoginDao extends JpaRepository<Login, Long> {
	Login findByUsername(String username);

}