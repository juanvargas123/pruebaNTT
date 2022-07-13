package com.microservicios.persona.datos;

import org.springframework.stereotype.Service;

@Service("datosUsuario")
public class DatosService {
	
    private DatosBean datosUsuario;
    
    public DatosResponse consultarUsuario(DatosRequest requestDTO) {
    	
    	datosUsuario= new DatosBean();
        datosUsuario.setFirstName("Juan");
        datosUsuario.setSecondName("David");
        datosUsuario.setSurName("Vargas");
        datosUsuario.setSecondSurName("Guarin");
        datosUsuario.setPhone("3102495234");
        datosUsuario.setAddress("Calle 78 66 44");
        datosUsuario.setCity("Bogota");
        
    	DatosResponse responseDTO = new DatosResponse();
        	
        validarObligatorio(requestDTO, responseDTO);
        if(responseDTO.getMensaje()!= null) {
        	return responseDTO;
        }
        
        validarTipoDocumento(requestDTO, responseDTO);
        if(responseDTO.getMensaje()!= null) {
        	return responseDTO;
        }
        
        verificarDocumento(requestDTO, responseDTO);
        if(responseDTO.getMensaje()!= null) {
        	return responseDTO;
        }
        
        
        responseDTO.setFirstName(datosUsuario.getFirstName());
        responseDTO.setSecondName(datosUsuario.getSecondName());
        responseDTO.setSurName(datosUsuario.getSurName());
        responseDTO.setLastSurName(datosUsuario.getSecondSurName());
        responseDTO.setPhone(datosUsuario.getPhone());
        responseDTO.setAddress(datosUsuario.getAddress());
        responseDTO.setCity(datosUsuario.getCity());
        
        return responseDTO;
        	
    }

	private void verificarDocumento(DatosRequest requestDTO, DatosResponse responseDTO) {
		if( requestDTO.getTypeDocument() != 'C' || !requestDTO.getNumberDocument().equals("23445322")) {
			responseDTO.setMensaje("Documento no encontrado");
		}
		
	}

	private void validarTipoDocumento(DatosRequest requestDTO, DatosResponse responseDTO) {
		if( requestDTO.getTypeDocument()!='P' && requestDTO.getTypeDocument()!='C') {
			responseDTO.setMensaje("Solo se permite C(Cedula) y P(Pasaporte)");
		}
		
	}

	private void validarObligatorio(DatosRequest requestDTO, DatosResponse responseDTO) {
		if( Character.isWhitespace(requestDTO.getTypeDocument()) ||requestDTO.getNumberDocument().isEmpty() || requestDTO.getNumberDocument().isEmpty()) {
			responseDTO.setMensaje("Datos Obligatorios no llenados");
		}
		
	}
}
