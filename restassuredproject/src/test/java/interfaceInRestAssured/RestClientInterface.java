package interfaceInRestAssured;

import io.restassured.response.Response;

public interface RestClientInterface {

	 void setBaseURI(String baseURI, int port);

	    Response get(String endpoint);
	
}
