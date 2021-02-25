package com.example.client.model;


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
    private String phone;
    private String secondContact;
    private String email;
    private String password;
    private String address;
    private int television;
    private int mobilePhone;
    private int telephone;
    private int internet;
    private Date creationDate;
    private String creationUser;
    private Date updateDate;
    private String updateUser;

    public Client(int id, String name, String firstSurname, String secondSurname, String phone, String secondContact, String email, String password, String address, int television, int mobilePhone, int telephone, int internet, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        this.id = id;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.phone = phone;
        this.secondContact = secondContact;
        this.email = email;
        this.password = password;
        this.address = address;
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecondContact() {
        return secondContact;
    }

    public void setSecondContact(String secondContact) {
        this.secondContact = secondContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
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
