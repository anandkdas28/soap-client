package com.scene7.assetupload.client;
import com.scene7.assetupload.ips.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class JobSubmitClient  extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(JobSubmitClient.class);


    public SubmitJobReturn submitJob(SubmitJobParam req) {
        AuthHeader header = getAuthHeader();
        SoapHeaderManager soapHeaderManager  = new SoapHeaderManager("submitJob", header);
        getWebServiceTemplate().setCheckConnectionForFault(true);
        SubmitJobReturn submitJobReturn  =  (SubmitJobReturn) getWebServiceTemplate().marshalSendAndReceive(req, soapHeaderManager);
        return submitJobReturn;
    }

    public GetAssetsByNameReturn getAssetsByName(GetAssetsByNameParam req) {
        AuthHeader header = getAuthHeader();
        SoapHeaderManager soapHeaderManager  = new SoapHeaderManager("getAssetsByName", header);
        getWebServiceTemplate().setCheckConnectionForFault(true);
        GetAssetsByNameReturn getAssetsByNameReturn = (GetAssetsByNameReturn) getWebServiceTemplate().marshalSendAndReceive(req, soapHeaderManager);
        return getAssetsByNameReturn;
    }

    public DeleteAssetReturn deleteAsset(DeleteAssetParam req) {
        AuthHeader header = getAuthHeader();
        SoapHeaderManager soapHeaderManager  = new SoapHeaderManager("deleteAsset", header);
        getWebServiceTemplate().setCheckConnectionForFault(true);
        DeleteAssetReturn deleteAssetReturn = (DeleteAssetReturn) getWebServiceTemplate().marshalSendAndReceive(req, soapHeaderManager);
        return deleteAssetReturn;
    }

    private static AuthHeader getAuthHeader() {
        AuthHeader header = new AuthHeader();
        header.setUser("");
        header.setPassword("");
        header.setAppName("");
        header.setAppVersion("1");
        return header;
    }

}

