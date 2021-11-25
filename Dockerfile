FROM bellsoft/liberica-openjdk-alpine-musl:11

WORKDIR /app

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /app/myapp.jar

ENTRYPOINT ["java","-jar","myapp.jar"]