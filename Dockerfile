FROM openjdk:11
ADD target/acik-kaynak-vize-0.0.1-SNAPSHOT.jar acik-kaynak-vize.jar
ENTRYPOINT ["java", "-jar", "acik-kaynak-vize.jar"]