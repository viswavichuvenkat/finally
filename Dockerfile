FROM openjdk:21
COPY ./target/app.jar app.jar
CMD ["java" ,"-jar","app.jar"]
