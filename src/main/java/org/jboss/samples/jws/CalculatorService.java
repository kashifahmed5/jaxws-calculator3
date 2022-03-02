package org.jboss.samples.jws;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
@WebService(serviceName = "Calculator", portName="CalculatorPort", endpointInterface = "org.jboss.samples.jws.Calculator", targetNamespace = "http://jws.samples.jboss.org" )
public class CalculatorService  implements Calculator {
	@Resource private WebServiceContext context; 
	public int add(int value1, int value2) { 
		System.out.println("User Principal: " + context.getUserPrincipal()); 
		return value1 + value2; 
		} 
	}

