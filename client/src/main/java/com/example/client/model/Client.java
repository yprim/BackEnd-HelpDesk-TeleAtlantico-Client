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
    private String Name;
    private String FirstSurname;
    private String SecondSurname;

    public Client(int id, String name, String firstSurname, String secondSurname, String phone, String secondContact, String email, String password, String address, int television, int mobilePhone, int telephone, int internet, Date creationDate, String creationUser, Date updateDate, String updateUser) {
        Id = id;
        Name = name;
        FirstSurname = firstSurname;
        SecondSurname = secondSurname;
        Phone = phone;
        SecondContact = secondContact;
        Email = email;
        Password = password;
        Address = address;
        Television = television;
        MobilePhone = mobilePhone;
        Telephone = telephone;
        Internet = internet;
        CreationDate = creationDate;
        CreationUser = creationUser;
        UpdateDate = updateDate;
        UpdateUser = updateUser;
    }

    private String Phone;
    private String SecondContact;
    private String Email;
    private String Password;
    private String Address;
    private int Television;
    private int MobilePhone;
    private int Telephone;



    private int Internet;
    private Date CreationDate;
    private String CreationUser;
    private Date UpdateDate;
    private String UpdateUser;




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
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstSurname() {
        return FirstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        FirstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return SecondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        SecondSurname = secondSurname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getSecondContact() {
        return SecondContact;
    }

    public void setSecondContact(String secondContact) {
        SecondContact = secondContact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getTelevision() {
        return Television;
    }

    public void setTelevision(int television) {
        Television = television;
    }

    public int getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public int getInternet() {
        return Internet;
    }

    public void setInternet(int internet) {
        Internet = internet;
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
