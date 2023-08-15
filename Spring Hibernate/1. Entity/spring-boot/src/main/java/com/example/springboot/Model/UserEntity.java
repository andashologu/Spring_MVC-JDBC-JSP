package com.example.springboot.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author anda
 */
@Entity
@Table(name = "userstest")
public class UserEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    @Column(name = "firstname", columnDefinition = "varchar(100)")
    public String firstname;
    
    @Column(name = "lastname", columnDefinition = "varchar(100)")
    public String lastname;

    @Column(name = "email", columnDefinition = "varchar(100)")
    public String email;

    @Column(name = "username", columnDefinition = "varchar(100)")
    public String username;
    
    @Column(name = "password", columnDefinition = "varchar(100)")
    public String password;

    public UserEntity(){
    }
    public UserEntity(String firstname, String lastname, String email, String username, String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = email;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', firstname='" + firstname +
                "', lastname='" + lastname +
                "', email='" + email +
                "', username='" + username +
                "', password='" + password +
                "'}";
    }
}


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', firstname='" + firstname +
                "', lastname='" + lastname +
                "', username='" + username +
                "', password='" + password +
                "'}";
    }
}
