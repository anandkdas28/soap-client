package com.scene7.assetupload.client;
import com.scene7.assetupload.ips.wsdl.AuthHeader;
import com.scene7.assetupload.ips.wsdl.SubmitJobParam;
import com.scene7.assetupload.ips.wsdl.SubmitJobReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.HashMap;
import java.util.Map;

public class JobSubmitClient  extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(JobSubmitClient.class);


    public SubmitJobReturn submitJob(SubmitJobParam req) {
        this.setDefaultUri("https://s7sps3apissl.scene7.com/scene7/services/IpsApiService");
        Map<String, String> headerList = new HashMap<>();
        headerList.put(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE);
        AuthHeader header = new AuthHeader();
        header.setUser("partner.anand.kumardas@philips.com");
        header.setPassword("z61a0C$KW");
        header.setAppName("philipstest");
        header.setAppVersion("1");
        SoapHeaderManager soapHeaderManager  = new SoapHeaderManager("submitJob", header);
        getWebServiceTemplate().setCheckConnectionForFault(true);
        this.getMarshaller();

        SubmitJobReturn submitJobReturn  =  (SubmitJobReturn) getWebServiceTemplate().marshalSendAndReceive(req, soapHeaderManager);
        return submitJobReturn;
    }

}

