FROM openjdk:11
COPY server/target/*.jar stats-server.jar
ENTRYPOINT ["java","-jar","/stats-server.jar"]