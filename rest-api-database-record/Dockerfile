FROM frolvlad/alpine-oraclejdk8:slim
LABEL Description="Eureka Account Client" Version="1.0"
ARG VERSION=1.0
VOLUME /tmp
ADD target/rest-api-database-record-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]