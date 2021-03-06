package com.buxiban.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Package: com.buxiban.common.config
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:28
 */
@Configuration
@EnableSwagger2
public class UserSwaggerConfig {
    @Bean
    public Docket userRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.basePackage("com.buxiban.user"))
                .paths(PathSelectors.any())
                .build()
                .groupName("用户管理");
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("补习班 用户管理 API接口")
                .description("补习班 用户管理 API接口")
                .termsOfServiceUrl("http://127.0.0.1:8080/doc.html")
                .version("1.0")
                .build();
    }
}
