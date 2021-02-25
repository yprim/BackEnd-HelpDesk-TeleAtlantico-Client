package com.example.client.model;

import javax.persistence.*;
import java.sql.Date;




@Entity
@Table(name = "Issue")
@NamedStoredProcedureQuery(
        name = "Issue.SelectIssueByClient",
        procedureName = "SelectIssueByClient",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "id",
                        type = Index.class)})

@NamedStoredProcedureQuery(
        name = "Issue.SelectIssueByReportNumber",
        procedureName = "SelectIssueByReportNumber",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "number",
                        type = String.class)
        })

public class Issue {

    private int id;
    private String reportNumber;
    private String address;
    private String contactPhone;
    private String contactEmail;
    private String status;
    private String supportUserAsigned;
    private int idUser;
    private String description;
    private String service;
    private Date creationDate;
    private String creationUser;
    private Date updateDate;
    private String updateUser;


    public Issue() {
    }

    public Issue(int id, String reportNumber, String address, String contactPhone, String contactEmail, String status, String supportUserAsigned, int idUser, String description, String service, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.reportNumber = reportNumber;
        this.address = address;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.status = status;
        this.supportUserAsigned = supportUserAsigned;
        this.idUser = idUser;
        this.description = description;
        this.service = service;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupportUserAsigned() {
        return supportUserAsigned;
    }

    public void setSupportUserAsigned(String supportUserAsigned) {
        this.supportUserAsigned = supportUserAsigned;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}

