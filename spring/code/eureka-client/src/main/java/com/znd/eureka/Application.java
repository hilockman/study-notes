package com.znd.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(
        		Application.class)
                .web(true).run(args);
    }
}