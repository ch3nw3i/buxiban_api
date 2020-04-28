package com.buxiban.org.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
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
public class OrgSwaggerConfig {
    @Bean
    public Docket orgRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.basePackage("com.buxiban.org"))
                .paths(PathSelectors.any())
                .build()
                .groupName("机构管理");
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("补习班 机构管理 API文档")
                .description("补习班 机构管理 API文档")
                .termsOfServiceUrl("http://127.0.0.1:8080/doc.html")
                .version("1.0")
                .build();
    }
}
