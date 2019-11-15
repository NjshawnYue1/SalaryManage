package com.usts.salarymanage.config;

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
 * @author shawnyue
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描basePackage包下面的“/api/”路径下的内容作为接口文档构建的目标
                .apis(RequestHandlerSelectors.basePackage("com.usts.salarymanage"))
                .paths(PathSelectors.regex("/api/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("员工薪资管理")
                .description("项目接口描述")
                .termsOfServiceUrl("https://github.com/NjshawnYue1/SalaryManage")
                .version("1.0")
                .build();
    }
}