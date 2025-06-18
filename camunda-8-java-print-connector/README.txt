#Required jar
connector-runtime-bundle-8.7.0-with-dependencies.jar

#Env variables to disable operate and provide custom server for 

export CAMUNDA_CONNECTOR_WEBHOOK_ENABLED=false
export CAMUNDA_CONNECTOR_POLLING_ENABLED=false
export OPERATE_CLIENT_ENABLED=false
export SERVER_PORT=8081

#Command to run connnector as java application.

java -cp 'path-to/connector-runtime-bundle-8.7.0-with-dependencies.jar:print-connector-0.0.1-SNAPSHOT.jar'   io.camunda.connector.runtime.app.ConnectorRuntimeApplication

