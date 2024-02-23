FROM eclipse-temurin:17
WORKDIR /app
COPY target/springboot-blog-rest-api-0.0.1-SNAPSHOT.jar /app/app.jar
ENV PROFILE=prod

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${PROFILE}"]
