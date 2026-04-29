# Build stage
FROM amazoncorretto:21-alpine AS build
WORKDIR /app
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline -q
COPY src/ src/
RUN ./mvnw package -DskipTests -q

# Run stage
FROM amazoncorretto:21-alpine
LABEL maintainer="patilvijayg.com"
WORKDIR /app
COPY --from=build /app/target/aboutme-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 7070
ENTRYPOINT ["java", "-jar", "app.jar"]
