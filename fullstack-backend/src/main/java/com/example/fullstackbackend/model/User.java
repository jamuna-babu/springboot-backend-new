package com.example.fullstackbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long d_id;
    private String Name;
    private String Contact;
    private String email;
    private String password;
    private String address;

    public Long getId() {
        return d_id;
    }

    public void setId(Long id) {
        this.d_id = id;
    }

    public String getUsername() {
        return Name;
    }

    public void setUsername(String username) {
        this.Name = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
