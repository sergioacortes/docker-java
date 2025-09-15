FROM eclipse-temurin:21.0.8_9-jdk AS BUILD
WORKDIR /build

EXPOSE 8080

COPY ./pom.xml .
COPY ./.mvn ./.mvn
COPY ./mvnw .

RUN ./mvnw dependency:go-offline

COPY ./src ./src
RUN ./mvnw clean install -DskipTests

FROM eclipse-temurin:21.0.8_9-jre-alpine

WORKDIR /app
COPY --from=BUILD /build/target/JavaDockerApp-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]