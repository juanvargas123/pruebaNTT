package com.microservicios.persona.datos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class DatosResponse {
	@ApiModelProperty
	private String mensaje;
    @ApiModelProperty
	private String firstName;
    @ApiModelProperty
	private String secondName;
    @ApiModelProperty
	private String surName;
    @ApiModelProperty
	private String lastSurName;
    @ApiModelProperty
	private String phone;
    @ApiModelProperty
	private String address;
    @ApiModelProperty
	private String city;
    
    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
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

	public String getLastSurName() {
		return lastSurName;
	}

	public void setLastSurName(String lastSurName) {
		this.lastSurName = lastSurName;
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

	@Override
	public String toString() {
		return "DatosResponse [mensaje=" + mensaje + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", surName=" + surName + ", lastSurName=" + lastSurName + ", phone=" + phone + ", address=" + address
				+ ", city=" + city + "]";
	}
}