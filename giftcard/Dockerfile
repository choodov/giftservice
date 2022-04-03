FROM adoptopenjdk/openjdk11
VOLUME /giftcard
COPY target/giftcard-*.jar giftcard.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar","giftcard.jar"]
