FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} cartservice.jar

ENTRYPOINT ["java", "-jar", "/cartservice.jar"]

EXPOSE 9876