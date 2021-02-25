package com.example.client.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

@Entity
@Table(name = "Comment")
@NamedStoredProcedureQuery(
        name = "Comment.SelectCommentByIssue",
        procedureName = "SelectCommentByIssue",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "number",
                        type = String.class)})
public class Comment {

    private int id;
    private String description;
    private int idIssue;
    private String reportNumber;
    private Date creationDate;
    private String creationUser;
    private Date updateDate;
    private String updateUser;

    public Comment() {
    }

    public Comment(int id, String description, int idIssue, String reportNumber, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.description = description;
        this.idIssue = idIssue;
        this.reportNumber = reportNumber;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdIssue() {
        return this.idIssue;
    }
    public void setIdIssue(int idIssue) {
    	this.idIssue = idIssue;
    }

    public String getReportNumber() {
        return this.reportNumber;
    }
    public void setReportNumber(String reportNumber) {
    	this.reportNumber = reportNumber;
    }
    public Date getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(Date creationDate) {
    	this.creationDate = creationDate;
    }
    public String getCreationUser() {
        return this.creationUser;
    }
    public void setCreationUser(String creationUser) {
    	this.creationUser = creationUser;
    }
    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
    	this.updateDate = updateDate;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
