FROM openjdk:17-jdk-slim
WORKDIR /demo
COPY . .
RUN ./mvnw clean package -DskipTests
EXPOSE ${PORT:-8083}
CMD ["java", "-jar", "target/*.jar"]
