FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8083

CMD ["sh", "-c", "java -jar target/*.jar"]
