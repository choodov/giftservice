FROM adoptopenjdk/openjdk11
VOLUME /config
COPY target/config-*.jar config.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar","config.jar"]
