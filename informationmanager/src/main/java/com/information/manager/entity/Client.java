package com.information.manager.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Client implements Serializable {

	
 

 
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3508729071631026501L;

	@Id
	@GeneratedValue
	public Integer clientID;
	
	public String clientName;
	
	public String projectName;
	
	public String password;

	public Integer getClientID() {
		return clientID;
	}
	
	 @OneToOne(mappedBy = "client")
	 @JsonManagedReference
	 private MasterCustomer masterCustomer;
	
	public MasterCustomer getMasterCustomer() {
		return masterCustomer;
	}

	public void setMasterCustomer(MasterCustomer masterCustomer) {
		this.masterCustomer = masterCustomer;
	}

	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 
	
}
