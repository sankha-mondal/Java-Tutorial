package com.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	//  Custom select:
	//  User defined method | Query: Find product based on condition | JPQL
	
	
	//  Retrieve data by Email Operation:-
	
	@Query("select u from User u where u.uEmail = :uEmail")
	public List<User> findUserByEmail(@Param("uEmail") String uEmail);
	

	//  Retrieve data by Email & Password Operation:-
	
	@Query("select u from User u where u.uEmail = :uEmail and u.uPassword = :uPassword")
	public List<User> findUserByEmailPass(@Param("uEmail") String uEmail,@Param("uPassword") String uPassword);
	
	//  Retrieve data Order By Id asc/desc :-
	
	@Query("select u from User u order by u.uId desc")
	public List<User> sortUserById();
	
	
	//  User defined method | Query: Record deleted by Email | JPQL
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("delete from User u where u.uEmail = :uEmail")
	public int deleteUserByEmail(@Param("uEmail") String uEmail);


}

