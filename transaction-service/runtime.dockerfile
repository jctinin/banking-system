FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . .

RUN ./mvw clean package

EXPOSE 8080

CMD ["java", "-jar", "target/transaction-service.jar"]