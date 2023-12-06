//package com.example.bdd.configuration;
//
//import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
//import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
//import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
//import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//    @Bean
//    public PhysicalNamingStrategy physical() {
//        return new PhysicalNamingStrategyStandardImpl();
//    }
//
//    @Bean
//    public ImplicitNamingStrategy implicit() {
//        return new ImplicitNamingStrategyLegacyJpaImpl();
//    }
//}
