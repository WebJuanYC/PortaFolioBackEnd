FROM amazoncorretto:17-alpine-jdk 

MAINTAINER juanynoñan

COPY target/back-0.0.1-SNAPSHOT.jar back-app.jar

ENTRYPOINT ["java","-jar","/back-app.jar"]