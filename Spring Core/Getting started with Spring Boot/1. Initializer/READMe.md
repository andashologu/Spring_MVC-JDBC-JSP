# Getting started - Initializer

Visit, https://start.spring.io/
1.	Create/Initialize a zipped project,
	Project: Maven Project
	Language: Java
	Spring boot version: 3.0.5 (current latest)
	Group: com.kapelle
	Packaging: Jar (for Kubernetes)
	Java version: 17 (currently supported)
	Dependencies: Spring web
2.	Create Home.java class in src/main/java/com/kapelle/projectname/Controller/Home.java
3.	Under src/main/java/com/kapelle/projectname/ you should have a main class, if not create it. SpringBootGettingStartedApplication.java
4.	Install Spring Boot Dashboard plugin and use it to run the application

By default the project runs on port 8080

5.	To change the port (for example to 9090), configure application.properties file found under / src/main/resources/application.properties. 
Add this configuration: server.port: 9090
if using an application.yml,
	server:
	    port: 9090
______________________________________________________________________


Home.java:

package com.kapelle.projectname.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home{

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
} 


SpringBootGettingStartedApplication.java:

package com.kapelle.projectname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGettingStartedApplication{

    public static void main(String[] args){
        SpringApplication.run(SpringBootGettingStartedApplication.class, args);
    }
}

