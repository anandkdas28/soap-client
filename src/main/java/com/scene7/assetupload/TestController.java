package com.scene7.assetupload;

import com.scene7.assetupload.client.JobSubmitClient;
import com.scene7.assetupload.ips.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public JobSubmitClient jobSubmitClient;

    @GetMapping("/getstatus")
    public SubmitJobReturn submit() {
        SubmitJobParam job = new SubmitJobParam();
        job.setCompanyHandle("c|748");
        job.setJobName("KMJOB-202212244");



        UploadUrl uploadUrl =  new UploadUrl();
        uploadUrl.setSourceUrl("https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg");
        uploadUrl.setDestPath("/philipstest/km/testwithanand_bird1");

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
        uploadUrlsJob.setPostHttpUrl("https://webhook.site/50057531-efd1-49fe-b13e-b429810eb32f?asset_code=testwithanand_bird1;token=123;jpbparam=1234");

        job.setUploadUrlsJob(uploadUrlsJob);
        return jobSubmitClient.submitJob(job);
    }
}
