FROM openjdk:8-alpine

COPY target/uberjar/rekam.jar /rekam/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/rekam/app.jar"]
