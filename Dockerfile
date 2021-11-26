FROM bellsoft/liberica-openjdk-alpine-musl:11

WORKDIR /app

COPY target/myapp.jar /app/myapp.jar

ENTRYPOINT ["java","-jar","myapp.jar"]