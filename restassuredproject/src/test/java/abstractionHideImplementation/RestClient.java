package abstractionHideImplementation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestClient {

	
	private String baseURI;
    private int port;

    public RestClient(String baseURI, int port) {
        this.baseURI = baseURI;
        this.port = port;
        RestAssured.baseURI = baseURI;
        RestAssured.port = port;
    }

    public Response get(String endpoint) {
        return RestAssured.get(endpoint);
    }
}
