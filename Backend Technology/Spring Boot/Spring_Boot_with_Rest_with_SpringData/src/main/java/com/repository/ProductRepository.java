package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	//  Custom select:

	//  User defined method | Query: Find product based on condition | JPQL
	@Query("select p from Product p where p.price > :price")
	public List<Product> findProductByPrice(@Param("price") float price);
	
	
	
	//  User defined method | Query: Order By asc/desc | JPQL
	@Query("select p from Product p order by p.price desc")
	public List<Product> sortByPrice();
	
	
	
	//  User defined method | Query: Record deleted by name | JPQL
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("delete from Product p where p.pname = :pname")
	public int deleteProductByName(@Param("pname") String pname);
	
	
}



