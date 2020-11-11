FROM openjdk:8-jdk-alpine
RUN addgroup -S techdemo && adduser -S techdemo -G techdemo
USER techdemo:techdemo
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} techdemo.jar
ENTRYPOINT ["java","-jar","techdemo.jar"]