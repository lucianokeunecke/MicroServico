package br.edu.infnet.fornecedor.config;

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
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build().apiInfo(getApiInfo());
    }
    
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Api Empenhos",
                "MIT Engenharia de Software com Java - Infnet",
                "1",
                "http://www.lucianokeunecke.com.br",
                new Contact("Luciano Keunecke","http://www.lucianokeunecke.com.br","luciano.keunecke@al.infnet.edu.br"),
                "LICENSE",
                "http://www.lucianokeunecke.com.br",
                Collections.emptyList()
        );
    }	

}
