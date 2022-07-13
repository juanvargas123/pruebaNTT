package com.microservicios.persona.datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("datos")
public class DatosController {
	
	@Autowired
    @Qualifier("datosService")
    private DatosService datosService;
    
    @PostMapping(value = "persona")
    public DatosResponse crearAccion(
    		@RequestBody DatosRequest requestDTO) {
              
        try {
            return datosService.consultarUsuario(requestDTO);
        }
        catch (Exception e) {
        }
        
        return null;
    }
}