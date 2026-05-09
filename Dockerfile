FROM openjdk:17-jdk-slim

WORKDIR /app

COPY .mvn .mvn
COPY mvnw mvnw
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

COPY src src
RUN ./mvnw clean package -DskipTests

EXPOSE 8082

CMD ["java", "-jar", "target/PG-Details-0.0.1-SNAPSHOT.jar"]