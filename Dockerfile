#docker build -f Dockerfile -t bankchecker . # for build the docker file
#docker image # for see list of images
#docker run -p 8080:8085 bankchecker
FROM openjdk:8
ADD target/bank-checker.jar bank-checker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "bank-checker.jar"]