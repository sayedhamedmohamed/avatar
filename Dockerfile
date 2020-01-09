FROM java:8
WORKDIR /
ADD integrant-aptar.jar integrant-aptar.jar
EXPOSE 8080
CMD java - jar integrant-aptar.jar
