FROM eclipse-temurin:17

LABEL author=deyvi.pajuelo

COPY target/test-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]