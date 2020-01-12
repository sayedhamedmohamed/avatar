FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} integrant-aptar.jar.jar
ENTRYPOINT ["java","-jar","/integrant-aptar.jar.jar"]

