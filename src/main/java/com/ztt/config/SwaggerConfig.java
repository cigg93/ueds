package com.ztt.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by ccc on 2017/4/8.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user")
                .apiInfo(demoApiInfo())
                .select()
                .paths(demoPaths())
                .build();
    }

    @Bean
    public Docket studentApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("student")
                .apiInfo(studentApiInfo())
                .select()
                .paths(studentPaths())
                .build();
    }

    private Predicate<String> demoPaths() {
        return or(regex("/user.*"));
    }

    private Predicate<String> studentPaths() {
        return or(regex("/student.*"));
    }

    private ApiInfo demoApiInfo() {
        return new ApiInfoBuilder()
                .title("高校教务管理信息系统")
                .description("ueds api description")
                .version("1.0")
                .build();
    }

    private ApiInfo studentApiInfo() {
        return new ApiInfoBuilder()
                .title("高校教务管理信息系统")
                .description("ueds api description")
                .version("1.0")
                .build();
    }


}
