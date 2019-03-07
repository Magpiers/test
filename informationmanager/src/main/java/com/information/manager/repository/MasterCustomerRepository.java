package com.information.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.information.manager.entity.MasterCustomer;

@Repository
public interface MasterCustomerRepository extends JpaRepository<MasterCustomer, Integer>{
	
public MasterCustomer findByClientClientID(@Param("clientID") Integer clientID);
}
