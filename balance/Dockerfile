FROM adoptopenjdk/openjdk11
VOLUME /balance
COPY target/balance-*.jar balance.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar","balance.jar"]
