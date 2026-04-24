
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY BusSystem.jar /app/BusSystem.jar

CMD ["java", "-jar", "BusSystem.jar"]
