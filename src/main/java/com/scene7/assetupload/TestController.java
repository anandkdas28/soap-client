package com.scene7.assetupload;

import com.scene7.assetupload.client.JobSubmitClient;
import com.scene7.assetupload.ips.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public JobSubmitClient jobSubmitClient;

    @GetMapping("/uploadAsset")
    public SubmitJobReturn submit(@RequestParam(name = "jobName") String jobName) {
        SubmitJobParam job = new SubmitJobParam();
        job.setCompanyHandle("c|748");
        job.setJobName("KMJOB-202212244"+jobName);



        UploadUrl uploadUrl =  new UploadUrl();
        uploadUrl.setSourceUrl("https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg");
        uploadUrl.setDestPath("/philipstest/km/testwithanandbird1"+jobName);

        UploadUrlArray urlArray = new UploadUrlArray();
        urlArray.getItems().add(uploadUrl);

        UploadUrlsJob uploadUrlsJob = new UploadUrlsJob();
        uploadUrlsJob.setUrlArray(urlArray);
        uploadUrlsJob.setOverwrite(true);
        uploadUrlsJob.setReadyForPublish(true);
        uploadUrlsJob.setPreservePublishState(true);
        uploadUrlsJob.setCreateMask(false);
        uploadUrlsJob.setPreserveCrop(true);
        uploadUrlsJob.setEmailSetting("Error");
        uploadUrlsJob.setPostJobOnlyIfFiles(false);
        uploadUrlsJob.setPostHttpUrl("https://webhook.site/50057531-efd1-49fe-b13e-b429810eb32f?asset_code=testwithanandbird1"+jobName+";token=123");

        job.setUploadUrlsJob(uploadUrlsJob);
        return jobSubmitClient.submitJob(job);
    }

    @GetMapping("/deleteAsset")
    public String deleteAsset(@RequestParam(name = "assetName") String assetName) {
        GetAssetsByNameParam detAssetsByNameParam= new  GetAssetsByNameParam();
        detAssetsByNameParam.setCompanyHandle("c|748");
        StringArray stringArray = new StringArray();
        stringArray.getItems().add(assetName);
        detAssetsByNameParam.setNameArray(stringArray);
        GetAssetsByNameReturn  getAssetsByNameReturn = jobSubmitClient.getAssetsByName(detAssetsByNameParam);

        DeleteAssetParam deleteAssetParam = new DeleteAssetParam();
        deleteAssetParam.setCompanyHandle("c|748");
        Asset asset = (Asset) getAssetsByNameReturn.getAssetArray().getItems().get(0);
        deleteAssetParam.setAssetHandle(asset.getAssetHandle());
        DeleteAssetReturn deleteAssetReturn = (DeleteAssetReturn) jobSubmitClient.deleteAsset(deleteAssetParam);
        return "Deleted : "+assetName;
    }
}
