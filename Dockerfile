FROM openjdk:17-jdk-alpine
MAINTAINER patilvijayg.com
COPY target/aboutme-0.0.1-SNAPSHOT.jar aboutme-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/aboutme-0.0.1-SNAPSHOT.jar"]