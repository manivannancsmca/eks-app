FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY target/*.jar eks-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","eks-app.jar"]