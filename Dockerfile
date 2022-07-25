FROM openjdk:8-jdk-alpine
COPY target/SpringBoot_Microservice_JWT_EurekaServer-1.jar SpringBoot_Microservice_JWT_EurekaServer-1.jar
CMD java -jar SpringBoot_Microservice_JWT_EurekaServer-1.jar