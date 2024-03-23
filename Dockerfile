FROM openjdk:11-jdk-alpine
COPY ./build/libs/*.jar vacation_calculator.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","vacation_calculator.jar"]