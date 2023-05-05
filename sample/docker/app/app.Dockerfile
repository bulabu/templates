FROM ubuntu:latest
RUN  apt update \
  && apt upgrade \
  && apt install -y ca-certificates \
  && update-ca-certificates \
  && apt install -y coreutils \
  && apt install -y tzdata curl unzip bash wget
RUN wget https://cache-redirector.jetbrains.com/intellij-jbr/jbrsdk_jcef-17.0.6-linux-aarch64-b829.9.tar.gz
RUN tar -xf jbrsdk_jcef-17.0.6-linux-aarch64-b829.9.tar.gz
RUN mv jbrsdk_jcef-17.0.6-linux-aarch64-b829.9 /usr/java
ENV JAVA_HOME=/usr/java
ENV PATH=$JAVA_HOME/bin:$PATH
WORKDIR /
WORKDIR /app
#CMD ["bash"]
CMD ["./gradlew", "bootRun"]