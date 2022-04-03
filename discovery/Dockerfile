FROM adoptopenjdk/openjdk11
VOLUME /discovery
COPY target/discovery-*.jar discovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar","discovery.jar"]
