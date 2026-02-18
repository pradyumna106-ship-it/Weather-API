package com.wheather.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // All endpoints
                .allowedOriginPatterns("http://localhost:5173", "http://localhost:3000")  // Vite ports
                .allowedOriginPatterns("https://weather-app-theta-brown-28.vercel.app","https://weather-app-git-main-j-pradyumnas-projects.vercel.app","https://weather-qnmyl858e-j-pradyumnas-projects.vercel.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
