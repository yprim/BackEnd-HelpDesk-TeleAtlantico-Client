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

    private int Id;
    private String name;
    private String first_surname;
    private String second_surname;
    private String phone;
    private String second_contact;
    private String email;
    private String password;
    private String address;
    private int television;
    private int mobile_phone;
    private int telephone;
    private int internet;
    private Date Creation_Date;
    private String Creation_User;
    private Date Update_Date;
    private String Update_User;

    public Client(int id, String name, String first_surname, String second_surname, String phone, String second_contact, String email, String password, int television, int mobile_phone, int telephone, int internet, Date creation_Date, String creation_User, Date update_Date, String update_User, String address) {
        Id = id;
        this.name = name;
        this.first_surname = first_surname;
        this.second_surname = second_surname;
        this.phone = phone;
        this.second_contact = second_contact;
        this.email = email;
        this.password = password;
        this.television = television;
        this.mobile_phone = mobile_phone;
        this.telephone = telephone;
        this.internet = internet;
        this.address = address;
        Creation_Date = creation_Date;
        Creation_User = creation_User;
        Update_Date = update_Date;
        Update_User = update_User;
    }

    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecond_contact() {
        return second_contact;
    }

    public void setSecond_contact(String second_contact) {
        this.second_contact = second_contact;
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

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(int mobile_phone) {
        this.mobile_phone = mobile_phone;
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

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

}
