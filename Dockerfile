FROM openjdk:latest
COPY ./target/semGroup2-0.1.0.5-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "semGroup2-0.1.0.5-jar-with-dependencies.jar"]