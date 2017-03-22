FROM java:8-jre
LABEL maintainer "pgolovenkov@luxoft.com"

# Prepare aplication folders
RUN mkdir -p /opt/gic

# Copy apps
COPY ./gic-maven-docker-springboot-poc.jar /opt/gic/

COPY ./entrypoint.sh /opt/
RUN chmod a+x /opt/entrypoint.sh

EXPOSE 8080

CMD sh /opt/entrypoint.sh