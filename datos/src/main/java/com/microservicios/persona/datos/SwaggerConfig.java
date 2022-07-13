package com.microservicios.persona.datos;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.microservicios.persona.datos")).paths(PathSelectors.any()).build()
                .apiInfo(metaDato());
    }

    private ApiInfo metaDato() {
        return new ApiInfo(
                "API de datos usuario",
                "Spring Boot API de datos ususario", 
                "1.0.0", 
                "Terminos del Servicio", 
                new Contact("", "", ""), 
                "Datos", 
                "",
                Collections.emptyList()
        );
    }

}
