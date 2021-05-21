FROM openjdk:11 as build
RUN mkdir -p /home/my-app
WORKDIR /home/my-app
COPY . /home/my-app
RUN ./mvnw clean package


FROM build
COPY /home/my-app/target/dashboard-0.0.1-SNAPSHOT.jar /home/my-app.jar
WORKDIR /home/
ENTRYPOINT ["java","-jar","my-app.jar"]
