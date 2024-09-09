FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/MOS-Burger-Shop-1.0-SNAPSHOT.jar MOS-Burger-Shop.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","MOS-Burger-Shop.jar"]