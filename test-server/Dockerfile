FROM maven:3.9.12-eclipse-temurin-25 AS build
COPY . /app
WORKDIR /app
RUN mvn clean install -DskipTests


FROM maven:3.9.12-eclipse-temurin-25
COPY --from=build /app/target/*.jar /app/app.jar

FROM eclipse-temurin:25-alpine-3.23


COPY --from=1 /app/app.jar /app/app.jar


EXPOSE 8080


ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]