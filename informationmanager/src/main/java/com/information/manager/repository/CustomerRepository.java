package com.information.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.information.manager.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	

}
