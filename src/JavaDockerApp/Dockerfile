FROM eclipse-temurin:21.0.8_9-jdk AS BUILD
WORKDIR /root/src

EXPOSE 8080

COPY src/JavaDockerApp/pom.xml .
COPY src/JavaDockerApp/.mvn ./.mvn
COPY src/JavaDockerApp/mvnw .

RUN /root/src/mvnw dependency:go-offline

COPY src/JavaDockerApp/src ./src
RUN /root/src/mvnw clean install -DskipTests

FROM eclipse-temurin:21.0.8_9-jre-alpine

WORKDIR /app
COPY --from=BUILD /build/target/JavaDockerApp-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]