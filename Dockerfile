FROM openjdk:17-alpine
# MAINTAINER baeldung.com
COPY target/spring-boot-pg-sample.jar spring-boot-pg-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-pg-sample.jar"]
