FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven-built jar file into the container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]
