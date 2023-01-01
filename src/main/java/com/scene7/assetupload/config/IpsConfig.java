package com.scene7.assetupload.config;


import com.scene7.assetupload.client.JobSubmitClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class IpsConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.scene7.assetupload.ips.wsdl");
        return marshaller;
    }

    @Bean
    public JobSubmitClient getClient() {
       JobSubmitClient service = new JobSubmitClient();
       service.setDefaultUri("https://s7sps3apissl.scene7.com/scene7/services/IpsApiService");
       service.setMarshaller(marshaller());
       service.setUnmarshaller(marshaller());
       return service;
   }
}
