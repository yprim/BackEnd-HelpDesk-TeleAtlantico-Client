package com.example.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
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
    private Date CreationDate;
    private String CreationUser;
    private Date UpdateDate;
    private String UpdateUser;


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
