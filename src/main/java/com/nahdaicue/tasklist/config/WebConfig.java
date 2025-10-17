
package com.nahdaicue.tasklist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Override
     public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // aplica a todos los endpoints
                .allowedOrigins("http://localhost:4200") // tu frontend Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH") // métodos permitidos
                .allowedHeaders("*") // permite todos los headers
                .allowCredentials(true); // permite envío de cookies/autenticación
    }
}
