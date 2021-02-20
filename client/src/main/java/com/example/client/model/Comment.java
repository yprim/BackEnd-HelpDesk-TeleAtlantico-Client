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
    private int id_issue;
    private String report_number;
    private Date Creation_Date;
    private String Creation_User;
    private Date Update_Date;
    private String Update_User;

    public Comment() {
    }

    public Comment(int id, String description, int id_issue, String report_number, Date creation_Date, String creation_User, Date update_Date, String update_User) {
        this.id = id;
        this.description = description;
        this.id_issue = id_issue;
        this.report_number = report_number;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_issue() {
        return id_issue;
    }

    public void setId_issue(int id_issue) {
        this.id_issue = id_issue;
    }

    public String getReport_number() {
        return report_number;
    }

    public void setReport_number(String report_number) {
        this.report_number = report_number;
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
