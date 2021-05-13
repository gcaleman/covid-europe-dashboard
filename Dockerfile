FROM openjdk:11-jdk-alpine as build
RUN mkdir -p app/source
COPY . /app/source
WORKDIR /app/source
RUN ./mvnw clean package


FROM build
ARG JAR_FILE=/app/source/target/*.jar
COPY --from=build ${JAR_FILE} app/my-app.jar
ENTRYPOINT ["java","-jar","/my-app.jar"]
