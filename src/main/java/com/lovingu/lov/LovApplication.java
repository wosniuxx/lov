package com.lovingu.lov;

import com.ricebook.rhllor.spring.boot.jersey.EnableJerseyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableJerseyConfiguration(scanPackage = "com.lovingu.lov.resource")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LovApplication {

  public static void main(String[] args) {
    SpringApplication.run(LovApplication.class, args);
  }
}
