FROM openjdk:11

HEALTHCHECK --interval=2m --timeout=10s \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

RUN apt-get update && apt-get -y install mariadb-client
COPY src/main/scripts/wait-for-mariadb.sh .
CMD ["sh","-c","./wait-for-mariadb.sh", "db", "LIMBO", "${DB_PASSWORD}"]

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]