package com.information.manager.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class MasterCustomer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -252854120874437827L;

	@Id
	@GeneratedValue
	private Integer masterCustomerID;
	
	private Boolean firstName;
	
	private Boolean lastName;
	
	@OneToOne
	@JoinColumn(name="clientID", nullable=false)
	@JsonBackReference
	private Client client;
	
	private Boolean GSTIN;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getMasterCustomerID() {
		return masterCustomerID;
	}

	public void setMasterCustomerID(Integer masterCustomerID) {
		this.masterCustomerID = masterCustomerID;
	}

	public Boolean getFirstName() {
		return firstName;
	}

	public void setFirstName(Boolean firstName) {
		this.firstName = firstName;
	}

	public Boolean getLastName() {
		return lastName;
	}

	public void setLastName(Boolean lastName) {
		this.lastName = lastName;
	}

	public Boolean getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(Boolean gSTIN) {
		GSTIN = gSTIN;
	}

	public Boolean getPincode() {
		return pincode;
	}

	public void setPincode(Boolean pincode) {
		this.pincode = pincode;
	}

	public String getFirstNameType() {
		return firstNameType;
	}

	public void setFirstNameType(String firstNameType) {
		this.firstNameType = firstNameType;
	}

	public String getLastNameType() {
		return lastNameType;
	}

	public void setLastNameType(String lastNameType) {
		this.lastNameType = lastNameType;
	}

	public String getGSTINType() {
		return GSTINType;
	}

	public void setGSTINType(String gSTINType) {
		GSTINType = gSTINType;
	}

	public String getPincodeType() {
		return pincodeType;
	}

	public void setPincodeType(String pincodeType) {
		this.pincodeType = pincodeType;
	}

	public Integer getFirstNameLength() {
		return firstNameLength;
	}

	public void setFirstNameLength(Integer firstNameLength) {
		this.firstNameLength = firstNameLength;
	}

	public Integer getLastNameLength() {
		return lastNameLength;
	}

	public void setLastNameLength(Integer lastNameLength) {
		this.lastNameLength = lastNameLength;
	}

	public Integer getGSTINLength() {
		return GSTINLength;
	}

	public void setGSTINLength(Integer gSTINLength) {
		GSTINLength = gSTINLength;
	}

	public Integer getPincodeLength() {
		return pincodeLength;
	}

	public void setPincodeLength(Integer pincodeLength) {
		this.pincodeLength = pincodeLength;
	}

	public Integer getFirstNamePositon() {
		return firstNamePositon;
	}

	public void setFirstNamePositon(Integer firstNamePositon) {
		this.firstNamePositon = firstNamePositon;
	}

	public Integer getLastNamePosition() {
		return lastNamePosition;
	}

	public void setLastNamePosition(Integer lastNamePosition) {
		this.lastNamePosition = lastNamePosition;
	}

	public Integer getGSTINPosition() {
		return GSTINPosition;
	}

	public void setGSTINPosition(Integer gSTINPosition) {
		GSTINPosition = gSTINPosition;
	}

	public Integer getPincodePosition() {
		return pincodePosition;
	}

	public void setPincodePosition(Integer pincodePosition) {
		this.pincodePosition = pincodePosition;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Boolean pincode;
	
	private String firstNameType;
	
	private String lastNameType;
	
	private String GSTINType;
	
	private String pincodeType;
	
	private Integer firstNameLength;
	
	private Integer lastNameLength;
	
	private Integer GSTINLength;
	
	private Integer pincodeLength;
	
	private Integer firstNamePositon;
	
	private Integer lastNamePosition;
	
	private Integer GSTINPosition;
	
	private Integer pincodePosition;
	
	private String clientName;
	
	
	


}
