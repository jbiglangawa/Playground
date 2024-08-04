# syntax=docker/dockerfile:1
# FROM public.ecr.aws/amazonlinux/amazonlinux:latest # Official Amazon image for amazonlinux
FROM gradle:jdk22 as cache
RUN mkdir -p /home/gradle/cache_home
ENV GRADLE_USER_HOME /home/gradle/cache_home
COPY . /home/gradle/java-code/
WORKDIR /home/gradle/java-code
RUN gradle clean build -i --stacktrace

FROM gradle:jdk22 as builder
COPY --from=cache /home/gradle/cache_home /home/gradle/.gradle
COPY . .
# RUN yum update -y # It's usually best to put this but it loads too slow
# RUN yum install findutils -y
COPY . /usr/src/java-code/
WORKDIR /usr/src/java-code
RUN gradle bootJar -i --stacktrace

FROM amazoncorretto:22-headless
EXPOSE 8080
WORKDIR /usr/src/java-app
COPY --from=builder /usr/src/java-code/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
