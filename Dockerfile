FROM  arm64v8/openjdk:8u302-jdk-oraclelinux8
RUN mkdir /opt/app
COPY target/tradingwebbackend-0.0.1.jar /opt/app
CMD ["java", "-jar", "/opt/app/tradingwebbackend-0.0.1.jar"]
EXPOSE 8081