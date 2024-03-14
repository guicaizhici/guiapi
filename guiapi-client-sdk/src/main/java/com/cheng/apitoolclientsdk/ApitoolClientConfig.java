package com.cheng.apitoolclientsdk;

import com.cheng.apitoolclientsdk.client.ApiToolClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("apitool.client")
@Data
@ComponentScan
public class ApitoolClientConfig {

    private String accessKey;

    private String secretKey;


    @Bean
    public ApiToolClient apiToolClient(){
        return new ApiToolClient(accessKey,secretKey);
    }
}
