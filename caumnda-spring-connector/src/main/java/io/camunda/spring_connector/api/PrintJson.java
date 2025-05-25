package io.camunda.spring_connector.api;

import io.camunda.connector.api.annotation.OutboundConnector;
import io.camunda.connector.api.error.ConnectorException;
import io.camunda.connector.api.outbound.OutboundConnectorContext;
import io.camunda.connector.api.outbound.OutboundConnectorFunction;
import io.camunda.spring_connector.dto.PrintRequest;
import io.camunda.spring_connector.dto.PrintResponse;


@OutboundConnector(name="Print Outbound Connector", 
inputVariables = {"input","location","message","ouput"},
type = "io.java:print-json:1"
)
public class PrintJson implements OutboundConnectorFunction {

	  
	
	@Override
	public Object execute(OutboundConnectorContext context) throws Exception {
		var connectorRequest = context.bindVariables(PrintRequest.class);
	    // (2)
	    return executeConnector(connectorRequest);
	}
	
	private PrintResponse executeConnector(final PrintRequest request) {
	    String location = request.getLocation();
	    String message = request.getMessage();

	    // (3)
	    if (message != null && message.toLowerCase().startsWith("fail")) {
	      throw new ConnectorException("FAIL", "My property started with 'fail', was: " + message);
	    }
	    System.out.println("Printing==>");
	    System.out.println("location:"+location);
	    System.out.println(",message:"+message);
	   // externalApiCall();

	    var result = new PrintResponse("Data printed");
	    return result;
	  }

}
