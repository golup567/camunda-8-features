

java -cp '/Users/shankarprajapat/checkout/tech-workspace/bpmn/camunda/8/feature/camunda-8-features/jar/connector-runtime-bundle-8.7.0-with-dependencies.jar:print-connector-0.0.1-SNAPSHOT.jar'   io.camunda.connector.runtime.app.ConnectorRuntimeApplication

export CAMUNDA_CONNECTOR_WEBHOOK_ENABLED=false
export CAMUNDA_CONNECTOR_POLLING_ENABLED=false
export OPERATE_CLIENT_ENABLED=false
export SERVER_PORT=8081