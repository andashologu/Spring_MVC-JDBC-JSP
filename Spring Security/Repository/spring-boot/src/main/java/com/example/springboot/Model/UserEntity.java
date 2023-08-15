package com.example.springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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

    @Column(name = "username", columnDefinition = "varchar(100)")
    public String username;
    
    @Column(name = "password", columnDefinition = "varchar(100)")
    public String password;

    @Column(name = "role", columnDefinition = "varchar(100)")
    public String role = "USER";

    public UserEntity(){
    }
    public UserEntity(String firstname, String lastname, String username, String password, String role){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', firstname='" + firstname +
                "', lastname='" + lastname +
                "', username='" + username +
                "', password='" + password +
                "', role='" + role +
                "'}";
    }
}
