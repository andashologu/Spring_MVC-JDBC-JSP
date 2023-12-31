# Getting started - JSP Support

1.	Add dependencies on the pom.xml file (Maven) to support Spring Boot with JSP.

	(i)	Spring web (spring-boot-starter-web and spring-boot-starter-test)
	Already added during Initializer process
	(ii) Embedded Servlet Container
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
	(iii) JSTL tags support required in our JSP pages
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
2.	Add this configuration to the application.properties file found under resources folder 
	spring.mvc.view.prefix: /WEB-INF/jsp/
	spring.mvc.view.suffix: .jsp
3.	Create path src/main/webapp/WEB-INF/jsp and jsp file and name it signup.jsp
4.	During Spring Initializer you created a Home.java class with @RestController annotation which allowed you to return a string value. Now create User.java controller class with @Controller annotation which allows you to return a jsp file instead of string.

The sign up page should be avalaible at localhost:9090/signup given that the port is still configured at 9090 as in the Initializer process.
 
User.java:

package com.kapelle.projectname.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User{

    @GetMapping("signup")
    public String signup() {
        return "signup";
    }
}

