FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
CMD ["./gradlew", "bootRun"]