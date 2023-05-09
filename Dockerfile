FROM amazoncorretto:8-alpine-jdk

copy target/back-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]