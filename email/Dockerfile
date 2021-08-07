FROM adoptopenjdk/openjdk11:alpine
VOLUME /tmp
ADD target/email-0.0.1-SNAPSHOT.jar email-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","email-0.0.1-SNAPSHOT.jar"]