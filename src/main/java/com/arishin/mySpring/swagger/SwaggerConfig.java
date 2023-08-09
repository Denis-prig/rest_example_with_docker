package com.arishin.mySpring.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {


    /*@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.arishin.mySpring.controller"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("Denis Spring", ""))
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("My First Spring rest serv with Swagger")
                .contact(new Contact("Denis", "url", "email"))
                .description("-------------------------------------")
                .termsOfServiceUrl("")
                .version("1")
                .build();
    }*/
    /*@Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry){
        viewControllerRegistry.addRedirectViewController("/swagger", "/");
    }*/
//http://localhost:8080/swagger-ui.html
    @Bean
    public Docket configApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select().apis(RequestHandlerSelectors.basePackage("com.arishin.mySpring.controller"))
                .paths(PathSelectors.any())
                .build();
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Study Rest Api services").description("My Spring that i write....").version("1.0").build();
    }
}
