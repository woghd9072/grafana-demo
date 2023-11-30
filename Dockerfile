FROM eclipse-temurin:17.0.5_8-jre-focal

ARG JAR_FILE_PATH=build/libs/*.jar

ADD ./deploy/opentelemetry-javaagent.jar                       opentelemetry-javaagent.jar
ADD ${JAR_FILE_PATH}                                           grafana-demo.jar

ENTRYPOINT java -javaagent:opentelemetry-javaagent.jar \
                -jar grafana-demo.jar