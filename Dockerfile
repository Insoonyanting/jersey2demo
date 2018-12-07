From maven:3.5.2-jdk-8-alpine

MAINTAINER Yanting yantinglinsg@gmail.com

WORKDIR /code

ADD pom.xml /code/pom.xml
ADD src /code/src
ADD settings.xml /root/.m2/settings.xml
ADD target/lib /code/lib 

RUN mvn package

CMD java -Djava.ext.dirs=/code/lib com.example.application.Main

EXPOSE 9998