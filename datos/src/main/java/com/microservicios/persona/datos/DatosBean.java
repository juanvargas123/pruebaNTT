package com.microservicios.persona.datos;

public class DatosBean {
	private String numberDocument;
	private char typeDocument;
	private String firstName;
	private String secondName;
	private String surName;
	private String secondSurName;
	private String phone;
	private String address;
	private String city;
	
	public DatosBean() {
		
	}
	public DatosBean(String numberDocument, char typeDocument, String firstName, String secondName, String surName,
			String secondSurName, String phone, String address, String city) {
		super();
		this.numberDocument = numberDocument;
		this.typeDocument = typeDocument;
		this.firstName = firstName;
		this.secondName = secondName;
		this.surName = surName;
		this.secondSurName = secondSurName;
		this.phone = phone;
		this.address = address;
		this.city = city;
	}
	
	public String getNumberDocument() {
		return numberDocument;
	}

	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}

	public char getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(char typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSecondSurName() {
		return secondSurName;
	}

	public void setSecondSurName(String secondSurName) {
		this.secondSurName = secondSurName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}