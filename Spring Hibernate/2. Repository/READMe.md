# Getting started – Repository


1.	You Created path src/main/java/com/example/springboot/Model and now create UserRepoitory.java class inside this folder.
2.	On the User.java class, auto wire UserRepository.java class and use it to save sign up details to the MySQL table.
    @Autowired UserRepository userRepository;
    PostMapping("signup")
    public String getSignup(UserEntity user) {
        System.out.println("Firstname: "+user.getFirstname());
        System.out.println("Lastname: "+user.getLastname());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Username: "+user.getUsername());
        System.out.println("Password: "+user.getPassword());
        userRepository.save(user);
    return "redirect:/";
    }
3.	Check the table created on terminal/ command prompt by login to your MySQL
    a.	mysql -u username -p
    b.	then password
    c.	use database;
    d.	show tables;
    e.	describe table;

    After submitting your sign up:
    f.	Select * from table; 
    At this point, you should not get empty results
4.	Use the repository method existsByUsernameAndPassword to login, 
    a.	Create this method in the repository class
    b.	Create GET and Post method in the controller class
    @GetMapping("login")
    public String login() {
    return "login";
    }
    @PostMapping("login")
    public String getLogin(HttpServletRequest request) {
        System.out.println("Username: "+request.getParameter("username"));
        System.out.println("Password: "+request.getParameter("password"));
        if(userRepository.existsByUsernameAndPassword(request.getParameter("username"), request.getParameter("password"))){
            System.out.println("Login success");
            return "redirect:/";
        }
        else{
            System.out.println("Login failure");
            return "login";
        }
    }
User login will be avalaible at localhost:9090/login 
UserRepository.java:

package com.kapelle.projectname.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
*
 * @author anda
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByUsernameAndPassword(String username, String password); 
}
 
User.java:

package com.kapelle.projectname.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kapelle.projectname.Model.UserEntity;
import com.kapelle.projectname.Model.UserRepository;

@Controller
public class UserController {

    @Autowired UserRepository userRepository;

    @GetMapping("signup")
    public String signup() {
        return "signup";
    }
    @PostMapping("signup")
    public String getSignup(UserEntity user) {
        System.out.println("Firstname: "+user.getFirstname());
        System.out.println("Lastname: "+user.getLastname());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Username: "+user.getUsername());
        System.out.println("Password: "+user.getPassword());
        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }
    @PostMapping("login")
    public String getLogin(HttpServletRequest request) {
        System.out.println("Username: "+request.getParameter("username"));
        System.out.println("Password: "+request.getParameter("password"));
        if(userRepository.existsByUsernameAndPassword(request.getParameter("username"), request.getParameter("password"))){
            System.out.println("Login success");
            return "redirect:/";
        }
        else{
            System.out.println("Login failure");
            return "login";
        }
    }
}


