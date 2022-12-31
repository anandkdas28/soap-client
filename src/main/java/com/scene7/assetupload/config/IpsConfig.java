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
        marshaller.setContextPath("com.scene7.assetupload.wsdl.generated");
        return marshaller;
    }

    @Bean
    public JobSubmitClient getClient() {
       JobSubmitClient service = new JobSubmitClient();
       service.setMarshaller(marshaller());
       service.setUnmarshaller(marshaller());
       return service;
   }
}
