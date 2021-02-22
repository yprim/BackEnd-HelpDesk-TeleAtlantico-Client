package com.example.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Comment {

    private int id;
    private String description;
    private int idIssue;
    private String reportNumber;
    private Date CreationDate;
    private String CreationUser;
    private Date UpdateDate;
    private String UpdateUser;

    public Comment() {
    }


    public Comment(int id, String description, int idIssue, String reportNumber, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.description = description;
        this.idIssue = idIssue;
        this.reportNumber = reportNumber;
        CreationDate = creationDate;
        CreationUser = creationUser;
        UpdateDate = updateDate;
        UpdateUser = updateUser;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdIssue() {
        return idIssue;
    }

    public void setIdIssue(int idIssue) {
        this.idIssue = idIssue;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public String getCreationUser() {
        return CreationUser;
    }

    public void setCreationUser(String creationUser) {
        CreationUser = creationUser;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    public String getUpdateUser() {
        return UpdateUser;
    }

    public void setUpdateUser(String updateUser) {
        UpdateUser = updateUser;
    }

}
