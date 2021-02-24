package com.example.client.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Comment")
@NamedStoredProcedureQuery(
        name = "Comment.SelectCommentByIssue",
        procedureName = "SelectCommentByIssue",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "id",
                        type = Index.class)})
public class Comment {

    private int Id;
    private String Description;
    private int IdIssue;
    private String ReportNumber;
    private Date CreationDate;
    private String CreationUser;
    private Date UpdateDate;
    private String UpdateUser;

    public Comment() {
    }

    public Comment(int id, String description, int idIssue, String reportNumber, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        Id = id;
        Description = description;
        IdIssue = idIssue;
        ReportNumber = reportNumber;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getIdIssue() {
        return IdIssue;
    }

    public void setIdIssue(int idIssue) {
        IdIssue = idIssue;
    }

    public String getReportNumber() {
        return ReportNumber;
    }

    public void setReportNumber(String reportNumber) {
        ReportNumber = reportNumber;
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
