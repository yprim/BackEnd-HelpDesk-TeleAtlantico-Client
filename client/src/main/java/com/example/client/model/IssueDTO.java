package com.example.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Date;


public class IssueDTO {

    private int id;
    private String reportNumber;
    private String classification;
    private String status;
    private String resolutionComment;
    private String contactEmail;
    private Integer idSupporter;
    private String description;
    private String service;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creationDate;

    private String creationUser;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updateDate;

    private String updateUser;


    public IssueDTO() {
    }

    public IssueDTO(Integer id, String reportNumber, String classification, String status, String resolutionComment, String contactEmail, int idSupporter, String description, String service, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.reportNumber = reportNumber;
        this.classification = classification;
        this.status = status;
        this.resolutionComment = resolutionComment;
        this.contactEmail = contactEmail;
        this.idSupporter = idSupporter;
        this.description = description;
        this.service = service;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    @JsonProperty("Id")
    public int getId() {
        return id;
    }
    @JsonProperty("Id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("ReportNumber")
    public String getReportNumber() {
        return reportNumber;
    }
    @JsonProperty("ReportNumber")
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }
    @JsonProperty("Classification")
    public String getClassification() {
        return classification;
    }
    @JsonProperty("Classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }
    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }
    @JsonProperty("ResolutionComment")
    public String getResolutionComment() {
        return resolutionComment;
    }
    @JsonProperty("ResolutionComment")
    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
    }
    @JsonProperty("ContactEmail")
    public String getContactEmail() {
        return contactEmail;
    }
    @JsonProperty("ContactEmail")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    @JsonProperty("IdSupporter")
    public Integer getIdSupporter() {
        return idSupporter;
    }
    @JsonProperty("IdSupporter")
    public void setIdSupporter(Integer idSupporter) {
        this.idSupporter = idSupporter;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Service")
    public String getService() {
        return service;
    }
    @JsonProperty("Service")
    public void setService(String service) {
        this.service = service;
    }
    @JsonProperty("CreationDate")
    public Date getCreationDate() {
        return creationDate;
    }
    @JsonProperty("CreationDate")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    @JsonProperty("CreationUser")
    public String getCreationUser() {
        return creationUser;
    }
    @JsonProperty("CreationUser")
    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }
    @JsonProperty("UpdateDate")
    public Date getUpdateDate() {
        return updateDate;
    }
    @JsonProperty("UpdateDate")
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    @JsonProperty("UpdateUser")
    public String getUpdateUser() {
        return updateUser;
    }
    @JsonProperty("UpdateUser")
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
