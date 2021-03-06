package cz.ucl.jee.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class GreetingService {
	
	private final String message = "Hello, ";

	public GreetingService() {		
	}

	//TODO show complex Java objects as both input and output

	@WebMethod
	@WebResult(name="greetings")
    public String sayHello(@WebParam(name="name") String name) {
        return message + name + ".";
    }
}
