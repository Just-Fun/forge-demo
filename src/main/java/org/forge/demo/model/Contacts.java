package org.forge.demo.model;
// Generated Mar 18, 2017 6:48:25 PM by Hibernate Tools 5.2.0.Final

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Contacts generated by hbm2java
 */
@Entity
@Table(name="contacts"
    ,catalog="phonebook"
)
public class Contacts  implements java.io.Serializable {


     private Integer contactId;
     private Users users;
     private String surname;
     private String name;
     private String patronymic;
     private String mobileNumber;
     private String homePhone;
     private String address;
     private String email;

    public Contacts() {
    }

	
    public Contacts(Users users, String surname, String name, String patronymic, String mobileNumber) {
        this.users = users;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.mobileNumber = mobileNumber;
    }
    public Contacts(Users users, String surname, String name, String patronymic, String mobileNumber, String homePhone, String address, String email) {
       this.users = users;
       this.surname = surname;
       this.name = name;
       this.patronymic = patronymic;
       this.mobileNumber = mobileNumber;
       this.homePhone = homePhone;
       this.address = address;
       this.email = email;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="contact_id", unique=true, nullable=false)
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    
    @Column(name="surname", nullable=false, length=45)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="patronymic", nullable=false, length=45)
    public String getPatronymic() {
        return this.patronymic;
    }
    
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    
    @Column(name="mobile_number", nullable=false, length=45)
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    @Column(name="home_phone", length=45)
    public String getHomePhone() {
        return this.homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    
    @Column(name="address", length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}

