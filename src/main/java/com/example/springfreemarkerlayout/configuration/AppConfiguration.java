package com.example.springfreemarkerlayout.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

@Configuration
public class AppConfiguration {

    @Bean
    public FreeMarkerConfigurationFactoryBean getFreeMarkerConfiguration() {
        FreeMarkerConfigurationFactoryBean fmConfigFactoryBean = new FreeMarkerConfigurationFactoryBean();
        fmConfigFactoryBean.setTemplateLoaderPath("/templates/");
        fmConfigFactoryBean.setDefaultEncoding("UTF-8");
        return fmConfigFactoryBean;
    }


}
