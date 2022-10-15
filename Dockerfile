#FROM <image>
FROM openjdk:8
# Temp Run location
VOLUME /tmp
# Provide Port Information
EXPOSE 8080
#Jar Location to mapping name
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]