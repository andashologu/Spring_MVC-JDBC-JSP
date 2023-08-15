FROM openjdk:8-jdk-alpine
EXPOSE 9090
ADD ./target/spring-boot-docker-testing.war spring-boot-docker-testing.war
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-testing.war"]