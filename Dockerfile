FROM eclipse-temurin:17.0.5_8-jre-focal
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} grafana-demo.jar
ENTRYPOINT ["java", "-jar", "grafana-demo.jar"]
