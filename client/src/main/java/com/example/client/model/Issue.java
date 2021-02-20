package com.example.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Issue {

    private int id;
    private String report_number;
    private String address;
    private String contact_phone;
    private String contact_email;
    private String status;
    private String support_user_asigned;
    private int id_user;
    private String description;
    private String service;
    private Date Creation_Date;
    private String Creation_User;
    private Date Update_Date;
    private String Update_User;


    public Issue() {
    }

    public Issue(int id, String report_number, String address, String contact_phone, String contact_email, String status, String support_user_asigned, int id_user, String description, String service, Date creation_Date, String creation_User, Date update_Date, String update_User) {
        this.id = id;
        this.report_number = report_number;
        this.address = address;
        this.contact_phone = contact_phone;
        this.contact_email = contact_email;
        this.status = status;
        this.support_user_asigned = support_user_asigned;
        this.id_user = id_user;
        this.description = description;
        this.service = service;
        Creation_Date = creation_Date;
        Creation_User = creation_User;
        Update_Date = update_Date;
        Update_User = update_User;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReport_number() {
        return report_number;
    }

    public void setReport_number(String report_number) {
        this.report_number = report_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupport_user_asigned() {
        return support_user_asigned;
    }

    public void setSupport_user_asigned(String support_user_asigned) {
        this.support_user_asigned = support_user_asigned;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public Date getCreation_Date() {
        return Creation_Date;
    }

    public void setCreation_Date(Date creation_Date) {
        Creation_Date = creation_Date;
    }

    public String getCreation_User() {
        return Creation_User;
    }

    public void setCreation_User(String creation_User) {
        Creation_User = creation_User;
    }

    public Date getUpdate_Date() {
        return Update_Date;
    }

    public void setUpdate_Date(Date update_Date) {
        Update_Date = update_Date;
    }

    public String getUpdate_User() {
        return Update_User;
    }

    public void setUpdate_User(String update_User) {
        Update_User = update_User;
    }






}
