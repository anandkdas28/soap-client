package com.scene7.assetupload.client;

import com.scene7.assetupload.ips.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.Map;

public class SoapHeaderManager implements WebServiceMessageCallback {

    private AuthHeader authHeader;

    private Logger logger = LoggerFactory.getLogger(SoapHeaderManager.class);
    private  Map<String, String> headerList;
    private  String soapAction;

    public SoapHeaderManager(String soapAction, AuthHeader authHeader) {
        if (!StringUtils.hasText(soapAction)) {
            soapAction = "\"\"";
        }
        this.soapAction = soapAction;
        this.authHeader = authHeader;
        this.headerList = null;
    }

    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
        //Set your soap action
        SoapMessage soapMessage = (SoapMessage) message;
        soapMessage.setSoapAction(soapAction);

        SoapHeader soapHeader = ((SoapMessage)message).getSoapHeader();
        try {
            JAXBContext context = JAXBContext.newInstance(AuthHeader.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(authHeader, soapHeader.getResult());

        } catch (JAXBException e) {
            throw new IOException("error while marshalling authentication.");
        }

    }

}
