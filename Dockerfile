FROM registry.cn-beijing.aliyuncs.com/ailikes_tools/alpine-openjdk8:latest
MAINTAINER 15600499930@163.com
VOLUME /tmp
ADD ./target/mybatis-gen.jar /app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8088
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --server.port=8088" ]