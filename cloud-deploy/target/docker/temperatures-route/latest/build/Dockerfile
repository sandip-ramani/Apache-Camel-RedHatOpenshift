FROM registry.redhat.io/fuse7/fuse-java-openshift-jdk11-rhel8:1.10
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="Example application for Guided Exercise: Deploying Camel Applications to OpenShift" org.label-schema.version=1.0-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2022-12-01T15:02:10.271703 org.label-schema.name=temperatures-route
EXPOSE 8080 8778 9779
COPY /deployments /deployments/
