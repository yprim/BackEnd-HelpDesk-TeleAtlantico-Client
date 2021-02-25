package com.example.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Client")
@NamedStoredProcedureQuery(
        name = "Client.SelectClientByEmail",
        procedureName = "SelectClientByEmail",
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "email",
                        type = String.class),
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "password",
                        type = String.class)})

public class Client {



    private int id;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String address;
    private String phone;
    private String secondContact;
    private String email;
    private String password;
    private int television;
    private int mobilePhone;
    private int telephone;
    private int internet;
    private Date creationDate;
    private String creationUser;
    private Date updateDate;
    private String updateUser;



    public Client(int id, String name, String firstSurname, String secondSurname, String address, String phone, String secondContact, String email, String password, int television, int mobilePhone, int telephone, int internet, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.address = address;
        this.phone = phone;
        this.secondContact = secondContact;
        this.email = email;
        this.password = password;
        this.television = television;
        this.mobilePhone = mobilePhone;
        this.telephone = telephone;
        this.internet = internet;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }


    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JsonProperty("Id")
    public int getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }



    @JsonProperty("FirstSurname")
    public String getFirstSurname() {
        return firstSurname;
    }

    @JsonProperty("FirstSurname")
    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    @JsonProperty("SecondSurname")
    public String getSecondSurname() {
        return secondSurname;
    }

    @JsonProperty("SecondSurname")
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("SecondContact")
    public String getSecondContact() {
        return secondContact;
    }

    @JsonProperty("SecondContact")
    public void setSecondContact(String secondContact) {
        this.secondContact = secondContact;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }


    @JsonProperty("Television")
    public int getTelevision() {
        return television;
    }

    @JsonProperty("Television")
    public void setTelevision(int television) {
        this.television = television;
    }

    @JsonProperty("MobilePhone")
    public int getMobilePhone() {
        return mobilePhone;
    }

    @JsonProperty("MobilePhone")
    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    @JsonProperty("Telephone")
    public int getTelephone() {
        return telephone;
    }

    @JsonProperty("Telephone")
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("Internet")
    public int getInternet() {
        return internet;
    }

    @JsonProperty("Internet")
    public void setInternet(int internet) {
        this.internet = internet;
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
