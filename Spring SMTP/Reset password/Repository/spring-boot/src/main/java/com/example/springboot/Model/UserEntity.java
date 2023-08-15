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

    @Column(name = "email", columnDefinition = "varchar(100)")
    public String email;

    @Column(name = "username", columnDefinition = "varchar(100)")
    public String username;
    
    @Column(name = "password", columnDefinition = "varchar(100)")
    public String password;

    @Column(name = "reset_password_token")
    private String resetPasswordToken;

    public UserEntity(){
    }
    public UserEntity(String firstname, String lastname, String email, String username, String password, String resetPasswordToken){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.resetPasswordToken = resetPasswordToken;
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

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', firstname='" + firstname +
                "', lastname='" + lastname +
                "', email='"+ email +
                "', username='" + username +
                "', password='" + password +
                "', resetPasswordToken'"+resetPasswordToken+
                "'}";
    }
}
