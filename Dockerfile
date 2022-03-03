FROM jboss/base-jdk:11

# dockerfile to build image for JBoss EAP 7.1

#start from eap71-openshift
FROM registry.access.redhat.com/jboss-eap-7/eap71-openshift

# file author / maintainer


# Copy war to deployments folder
COPY jaxws-calculator.war $JBOSS_HOME/standalone/deployments/

# User root to modify war owners
USER root


# Modify owners war
RUN chown jboss:jboss $JBOSS_HOME/standalone/deployments/jaxws-calculator.war


# Important, use jboss user to run image
USER jboss

