FROM azul/zulu-openjdk:8u252-8.46.0.19
VOLUME /tmp
COPY target/docker-0.0.1-SNAPSHOT.jar abc.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","abc.jar"]