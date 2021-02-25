package com.example.client.model;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentDTO {
	
    private String description;
    private int idIssue;
    private String reportNumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creationDate;
    private String creationUser;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updateDate;
    private String updateUser;

    public CommentDTO() {
    }

    public CommentDTO( String description, int idIssue, String reportNumber, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.description = description;
        this.idIssue = idIssue;
        this.reportNumber = reportNumber;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return this.description;
    }
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Issue")
    public int getIdIssue() {
        return this.idIssue;
    }
    @JsonProperty("Issue")
    public void setIdIssue(int idIssue) {
    	this.idIssue = idIssue;
    }

    @JsonProperty("ReportNumber")
    public String getReportNumber() {
        return this.reportNumber;
    }
    @JsonProperty("ReportNumber")
    public void setReportNumber(String reportNumber) {
    	this.reportNumber = reportNumber;
    }
    @JsonProperty("CreationDate")
    public Date getCreationDate() {
        return this.creationDate;
    }
    @JsonProperty("CreationDate")
    public void setCreationDate(Date creationDate) {
    	this.creationDate = creationDate;
    }
    @JsonProperty("CreationUser")
    public String getCreationUser() {
        return this.creationUser;
    }
    @JsonProperty("CreationUser")
    public void setCreationUser(String creationUser) {
    	this.creationUser = creationUser;
    }
    @JsonProperty("UpdateDate")
    public Date getUpdateDate() {
        return this.updateDate;
    }
    @JsonProperty("UpdateDate")
    public void setUpdateDate(Date updateDate) {
    	this.updateDate = updateDate;
    }
    @JsonProperty("UpdateUser")
    public String getUpdateUser() {
        return this.updateUser;
    }

    @JsonProperty("UpdateUser")
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}
