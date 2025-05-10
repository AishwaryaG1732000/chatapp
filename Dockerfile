# Use a base image with Java 17
FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy Maven wrapper and source code
COPY . /app

# Give executable permission to the mvnw file
RUN chmod +x mvnw

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Run the JAR file
CMD ["java", "-jar", "target/app-0.0.1-SNAPSHOT.jar"]
