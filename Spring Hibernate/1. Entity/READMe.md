# Getting started – Entity


1.	Must have already configure MySQL:
	(i)	Download & InstallMySQL Workbench
	(ii) Launch MySQL Workbench & set root username & password
			Username: root
			Password: Root@2023
	(iii) Download & Install MySQL Installer
	(iv) Add MySQL to the Path: C:\Program Files\MySQL\MySQL Server 8.0\bin
	(v)	Verify installation: MySQL –version
	(vi) Connect to MySQL via cmd: mysql -u username -p password
2.	Add dependencies on the pom.xml file
	(i)	JPA
		<dependency> 
			<groupId>org.springframework.boot</groupId>  
			<artifactId>spring-boot-starter-data-jpa</artifactId> 
		</dependency>  
	(ii)	MySQL
		<dependency> 
			<groupId>mysql</groupId>  
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.32</version>   
			<scope>runtime</scope> 
		</dependency> 
		NB: scope runtime must be specified to avoid Failed to determine a suitable driver class error
3.	Add this configuration to the application.properties file found under resources folder 
	#Local db
	spring.datasource.driverClassName = com.mysql.cj.jdbc.Driver
	spring.datasource.url = jdbc:mysql://localhost:3306/database
	spring.datasource.username = username
	spring.datasource.password = password
	#Config
	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=true
	logging.level.org.springframework.jdbc.core=DEBUG

4.	Create path src/main/java/com/example/springboot/Model and UserEntity.java class inside this folder.
5.	On the UserController.java class you already created a GET method for this url localhost:9090/signup during the Get started process. Now create a Post method.
	@PostMapping("signup")
	public String getSignup(UserEntity user) {
		System.out.println("Firstname: "+user.getFirstname());
		System.out.println("Lastname: "+user.getLastname());
		System.out.println("Email: "+user.getEmail());
		System.out.println("Username: "+user.getUsername());
		System.out.println("Password: "+user.getPassword());
		return "redirect:/";
	}
6.	Run the application. Notice as soon as you run the application a MySQL table will be created, even though at this point you can’t save data into it because you still need to create a repository java class. Check the table created on terminal/ command prompt by login to your MySQL
	a.	mysql -u username -p
	b.	then password
	c.	use database;
	d.	show tables;
	e.	describe table;
	At this point you should see the table with all the columns created in the Entity class.
	f.	Select * from table;  
	
UserEntity.java:

package com.kapelle.projectname.Model;

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



 
UserController.java:

package com.kapelle.projectname.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.Model.UserEntity;

@Controller
public class UserController {

    @GetMapping("signup")
    public String signup() {
        return "signup";
    }
    @PostMapping("signup")
    public String getSignup(UserEntity user) {
        System.out.println("Firstname: "+user.getFirstname());
        System.out.println("Lastname: "+user.getLastname());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Usertname: "+user.getUsername());
        System.out.println("Password: "+user.getPassword());
        return "redirect:/";
    }
}


	



