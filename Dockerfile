#FROM openjdk
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","${JAVA_OPTS}","-jar","/app.jar"]

#FROM openjdk
#ADD . /src
#WORKDIR /src
#RUN ./mvnw package -DskipTests
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","target/mySpring-0.0.1-SNAPSHOT.jar"]

#//FOR DOCKER   (container) docker run  --network=host  -p 8080:8080 rest-postgress

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]
