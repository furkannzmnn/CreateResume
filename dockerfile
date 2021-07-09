FROM openjdk:11 AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:11
WORKDIR Resume
COPY --from=build target/*.jar Resume.jar
ENTRYPOINT ["java", "-jar", "Resume.jar"]