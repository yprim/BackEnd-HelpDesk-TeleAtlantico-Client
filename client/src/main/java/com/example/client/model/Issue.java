package com.example.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Issue {

    private int Id;
    private String ReportNumber;
    private String Address;
    private String ContactPhone;
    private String ContactEmail;
    private String Status;
    private String SupportUserAsigned;
    private int IdUser;
    private String Description;
    private String Service;
    private Date CreationDate;
    private String CreationUser;
    private Date UpdateDate;
    private String UpdateUser;


    public Issue() {
    }

    public Issue(int id, String reportNumber, String address, String contactPhone, String contactEmail, String status, String supportUserAsigned, int idUser, String description, String service, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        Id = id;
        ReportNumber = reportNumber;
        Address = address;
        ContactPhone = contactPhone;
        ContactEmail = contactEmail;
        Status = status;
        SupportUserAsigned = supportUserAsigned;
        IdUser = idUser;
        Description = description;
        Service = service;
        CreationDate = creationDate;
        CreationUser = creationUser;
        UpdateDate = updateDate;
        UpdateUser = updateUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getReportNumber() {
        return ReportNumber;
    }

    public void setReportNumber(String reportNumber) {
        ReportNumber = reportNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactPhone() {
        return ContactPhone;
    }

    public void setContactPhone(String contactPhone) {
        ContactPhone = contactPhone;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSupportUserAsigned() {
        return SupportUserAsigned;
    }

    public void setSupportUserAsigned(String supportUserAsigned) {
        SupportUserAsigned = supportUserAsigned;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
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
