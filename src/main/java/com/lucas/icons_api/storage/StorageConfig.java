package com.lucas.icons_api.storage;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StorageConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/bandeiras/**")
                .addResourceLocations("file:uploads/bandeiras/");

        registry
                .addResourceHandler("/escudos/**")
                .addResourceLocations("file:uploads/escudos/");

        registry
                .addResourceHandler("/jogadores/**")
                .addResourceLocations("file:uploads/jogadores/");
    }
}
