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

    @Column(name = "username", columnDefinition = "varchar(100)")
    public String username;

    @Column(name = "email", columnDefinition = "varchar(100)")
    public String email;
    
    @Column(name = "password", columnDefinition = "varchar(100)")
    public String password;
     
    private boolean isEnabled;//SMTP.......................

    public UserEntity(){
    }
    public UserEntity(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isEnabled() {
        return isEnabled;
    }
    public void setEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                "', username='" + username +
                "', email='" + email +
                "', password='" + password +
                "', isEnabled='" + isEnabled +
                "'}";
    }
}
