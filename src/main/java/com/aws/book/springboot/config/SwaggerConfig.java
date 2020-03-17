package com.aws.book.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.aws"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metainfo());
    }

    private ApiInfo metainfo() {

        ApiInfo apiInfo = new ApiInfo("xxx", "yyy", "1.0", "Terms of Service", new Contact("liangjinyong", null, null), null, null);
        return apiInfo;
    }
}