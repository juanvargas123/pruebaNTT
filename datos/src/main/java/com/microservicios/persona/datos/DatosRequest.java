package com.microservicios.persona.datos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class DatosRequest {
    @ApiModelProperty
    private String numberDocument;
    @ApiModelProperty
	private char typeDocument;
    
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

	@Override
	public String toString() {
		return "DatosRequest [numberDocument=" + numberDocument + ", typeDocument=" + typeDocument + "]";
	}
}
