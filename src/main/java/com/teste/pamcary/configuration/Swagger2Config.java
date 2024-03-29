package com.teste.pamcary.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.abraao.venda.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiInfo() );
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "cadastro-aluno",
                "Sistemas de cadastro de aluno",
                "0.0.1",
                "",
                new Contact("Pamcary",
                        "https://<url-do-bit-bucket>",
                        "<email@pamcary.com.br>"),
                "Licence API", "https://www.Pamcary.com.br/", Collections.emptyList());
    }
}