FROM openjdk:17 AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17
WORKDIR lcm-calculator
COPY --from=build target/*.jar lcm-calculator.jar
ENTRYPOINT ["java", "-jar", "lcm-calculator.jar"]