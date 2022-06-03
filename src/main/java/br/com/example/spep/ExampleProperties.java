package br.com.example.spep;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "spep")
@Getter
@Setter
public class ExampleProperties {

    /**
     * Simple test.
     */
    String test;
}
