//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.30 at 07:28:19 pm IST 
//


package com.scene7.assetupload.wsdl.generated;

import com.scene7.assetupload.ips.wsdl.*;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="execTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="execSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageServingPublishJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}ImageServingPublishJob" minOccurs="0"/>
 *         &lt;element name="imageRenderingPublishJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}ImageRenderingPublishJob" minOccurs="0"/>
 *         &lt;element name="videoPublishJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}VideoPublishJob" minOccurs="0"/>
 *         &lt;element name="serverDirectoryPublishJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}ServerDirectoryPublishJob" minOccurs="0"/>
 *         &lt;element name="metadataPublishJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}MetadataPublishJob" minOccurs="0"/>
 *         &lt;element name="uploadDirectoryJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}UploadDirectoryJob" minOccurs="0"/>
 *         &lt;element name="uploadUrlsJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}UploadUrlsJob" minOccurs="0"/>
 *         &lt;element name="optimizeImagesJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}OptimizeImagesJob" minOccurs="0"/>
 *         &lt;element name="ripPdfsJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}RipPdfsJob" minOccurs="0"/>
 *         &lt;element name="reprocessAssetsJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}ReprocessAssetsJob" minOccurs="0"/>
 *         &lt;element name="createVideoSitemapJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}CreateVideoSitemapJob" minOccurs="0"/>
 *         &lt;element name="exportJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}ExportJob" minOccurs="0"/>
 *         &lt;element name="automatedSetGenerationJob" type="{http://www.scene7.com/IpsApi/xsd/2014-04-03}AutomatedSetGenerationJob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyHandle",
    "userHandle",
    "jobName",
    "locale",
    "execTime",
    "execSchedule",
    "description",
    "imageServingPublishJob",
    "imageRenderingPublishJob",
    "videoPublishJob",
    "serverDirectoryPublishJob",
    "metadataPublishJob",
    "uploadDirectoryJob",
    "uploadUrlsJob",
    "optimizeImagesJob",
    "ripPdfsJob",
    "reprocessAssetsJob",
    "createVideoSitemapJob",
    "exportJob",
    "automatedSetGenerationJob"
})
@XmlRootElement(name = "submitJobParam")
public class SubmitJobParam {

    @XmlElement(required = true)
    protected String companyHandle;
    protected String userHandle;
    @XmlElement(required = true)
    protected String jobName;
    protected String locale;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execTime;
    protected String execSchedule;
    protected String description;
    protected ImageServingPublishJob imageServingPublishJob;
    protected ImageRenderingPublishJob imageRenderingPublishJob;
    protected VideoPublishJob videoPublishJob;
    protected ServerDirectoryPublishJob serverDirectoryPublishJob;
    protected MetadataPublishJob metadataPublishJob;
    protected UploadDirectoryJob uploadDirectoryJob;
    protected UploadUrlsJob uploadUrlsJob;
    protected OptimizeImagesJob optimizeImagesJob;
    protected RipPdfsJob ripPdfsJob;
    protected ReprocessAssetsJob reprocessAssetsJob;
    protected CreateVideoSitemapJob createVideoSitemapJob;
    protected ExportJob exportJob;
    protected AutomatedSetGenerationJob automatedSetGenerationJob;

    /**
     * Gets the value of the companyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyHandle() {
        return companyHandle;
    }

    /**
     * Sets the value of the companyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyHandle(String value) {
        this.companyHandle = value;
    }

    /**
     * Gets the value of the userHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHandle() {
        return userHandle;
    }

    /**
     * Sets the value of the userHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHandle(String value) {
        this.userHandle = value;
    }

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the execTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecTime() {
        return execTime;
    }

    /**
     * Sets the value of the execTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecTime(XMLGregorianCalendar value) {
        this.execTime = value;
    }

    /**
     * Gets the value of the execSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecSchedule() {
        return execSchedule;
    }

    /**
     * Sets the value of the execSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecSchedule(String value) {
        this.execSchedule = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the imageServingPublishJob property.
     * 
     * @return
     *     possible object is
     *     {@link ImageServingPublishJob }
     *     
     */
    public ImageServingPublishJob getImageServingPublishJob() {
        return imageServingPublishJob;
    }

    /**
     * Sets the value of the imageServingPublishJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageServingPublishJob }
     *     
     */
    public void setImageServingPublishJob(ImageServingPublishJob value) {
        this.imageServingPublishJob = value;
    }

    /**
     * Gets the value of the imageRenderingPublishJob property.
     * 
     * @return
     *     possible object is
     *     {@link ImageRenderingPublishJob }
     *     
     */
    public ImageRenderingPublishJob getImageRenderingPublishJob() {
        return imageRenderingPublishJob;
    }

    /**
     * Sets the value of the imageRenderingPublishJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageRenderingPublishJob }
     *     
     */
    public void setImageRenderingPublishJob(ImageRenderingPublishJob value) {
        this.imageRenderingPublishJob = value;
    }

    /**
     * Gets the value of the videoPublishJob property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPublishJob }
     *     
     */
    public VideoPublishJob getVideoPublishJob() {
        return videoPublishJob;
    }

    /**
     * Sets the value of the videoPublishJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPublishJob }
     *     
     */
    public void setVideoPublishJob(VideoPublishJob value) {
        this.videoPublishJob = value;
    }

    /**
     * Gets the value of the serverDirectoryPublishJob property.
     * 
     * @return
     *     possible object is
     *     {@link ServerDirectoryPublishJob }
     *     
     */
    public ServerDirectoryPublishJob getServerDirectoryPublishJob() {
        return serverDirectoryPublishJob;
    }

    /**
     * Sets the value of the serverDirectoryPublishJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerDirectoryPublishJob }
     *     
     */
    public void setServerDirectoryPublishJob(ServerDirectoryPublishJob value) {
        this.serverDirectoryPublishJob = value;
    }

    /**
     * Gets the value of the metadataPublishJob property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataPublishJob }
     *     
     */
    public MetadataPublishJob getMetadataPublishJob() {
        return metadataPublishJob;
    }

    /**
     * Sets the value of the metadataPublishJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataPublishJob }
     *     
     */
    public void setMetadataPublishJob(MetadataPublishJob value) {
        this.metadataPublishJob = value;
    }

    /**
     * Gets the value of the uploadDirectoryJob property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDirectoryJob }
     *     
     */
    public UploadDirectoryJob getUploadDirectoryJob() {
        return uploadDirectoryJob;
    }

    /**
     * Sets the value of the uploadDirectoryJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDirectoryJob }
     *     
     */
    public void setUploadDirectoryJob(UploadDirectoryJob value) {
        this.uploadDirectoryJob = value;
    }

    /**
     * Gets the value of the uploadUrlsJob property.
     * 
     * @return
     *     possible object is
     *     {@link UploadUrlsJob }
     *     
     */
    public UploadUrlsJob getUploadUrlsJob() {
        return uploadUrlsJob;
    }

    /**
     * Sets the value of the uploadUrlsJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadUrlsJob }
     *     
     */
    public void setUploadUrlsJob(UploadUrlsJob value) {
        this.uploadUrlsJob = value;
    }

    /**
     * Gets the value of the optimizeImagesJob property.
     * 
     * @return
     *     possible object is
     *     {@link OptimizeImagesJob }
     *     
     */
    public OptimizeImagesJob getOptimizeImagesJob() {
        return optimizeImagesJob;
    }

    /**
     * Sets the value of the optimizeImagesJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimizeImagesJob }
     *     
     */
    public void setOptimizeImagesJob(OptimizeImagesJob value) {
        this.optimizeImagesJob = value;
    }

    /**
     * Gets the value of the ripPdfsJob property.
     * 
     * @return
     *     possible object is
     *     {@link RipPdfsJob }
     *     
     */
    public RipPdfsJob getRipPdfsJob() {
        return ripPdfsJob;
    }

    /**
     * Sets the value of the ripPdfsJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link RipPdfsJob }
     *     
     */
    public void setRipPdfsJob(RipPdfsJob value) {
        this.ripPdfsJob = value;
    }

    /**
     * Gets the value of the reprocessAssetsJob property.
     * 
     * @return
     *     possible object is
     *     {@link ReprocessAssetsJob }
     *     
     */
    public ReprocessAssetsJob getReprocessAssetsJob() {
        return reprocessAssetsJob;
    }

    /**
     * Sets the value of the reprocessAssetsJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReprocessAssetsJob }
     *     
     */
    public void setReprocessAssetsJob(ReprocessAssetsJob value) {
        this.reprocessAssetsJob = value;
    }

    /**
     * Gets the value of the createVideoSitemapJob property.
     * 
     * @return
     *     possible object is
     *     {@link CreateVideoSitemapJob }
     *     
     */
    public CreateVideoSitemapJob getCreateVideoSitemapJob() {
        return createVideoSitemapJob;
    }

    /**
     * Sets the value of the createVideoSitemapJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateVideoSitemapJob }
     *     
     */
    public void setCreateVideoSitemapJob(CreateVideoSitemapJob value) {
        this.createVideoSitemapJob = value;
    }

    /**
     * Gets the value of the exportJob property.
     * 
     * @return
     *     possible object is
     *     {@link ExportJob }
     *     
     */
    public ExportJob getExportJob() {
        return exportJob;
    }

    /**
     * Sets the value of the exportJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportJob }
     *     
     */
    public void setExportJob(ExportJob value) {
        this.exportJob = value;
    }

    /**
     * Gets the value of the automatedSetGenerationJob property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedSetGenerationJob }
     *     
     */
    public AutomatedSetGenerationJob getAutomatedSetGenerationJob() {
        return automatedSetGenerationJob;
    }

    /**
     * Sets the value of the automatedSetGenerationJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedSetGenerationJob }
     *     
     */
    public void setAutomatedSetGenerationJob(AutomatedSetGenerationJob value) {
        this.automatedSetGenerationJob = value;
    }

}