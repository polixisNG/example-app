FROM maven:3.8.6-eclipse-temurin-17-focal as maven
WORKDIR opt/app
COPY . .
RUN mvn clean package

FROM bellsoft/liberica-openjdk-debian:17
WORKDIR opt/app
COPY --from=maven opt/app/target/example-*.jar .
ENTRYPOINT java -jar example-*.jar