package com.information.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.information.manager.entity.Client;
import com.information.manager.entity.MasterCustomer;
import com.information.manager.repository.ClientRepository;
import com.information.manager.repository.MasterCustomerRepository;

@RestController
public class MasterDataController {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private MasterCustomerRepository masterCustomerRepository;
	
	@GetMapping("/findCustomerMasterDatails/{clientID}")
	public MasterCustomer findMasterDataForCustomerByClient(@PathVariable("clientID") Integer clientID) {
		return masterCustomerRepository.findByClientClientID(clientID);
	}
	
	@PostMapping("/saveClient")
	public Client saveClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@PostMapping("/createMasterDataByClientID")
	public MasterCustomer saveMasterDataClient(@RequestBody MasterCustomer masterCustomer) {
		return masterCustomerRepository.save(masterCustomer);
	}
}
