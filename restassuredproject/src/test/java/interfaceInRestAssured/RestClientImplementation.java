package interfaceInRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestClientImplementation implements RestClientInterface {

	private String baseURI;
    private int port;

    @Override
    public void setBaseURI(String baseURI, int port) {
        this.baseURI = baseURI;
        this.port = port;
        RestAssured.baseURI = baseURI;
        RestAssured.port = port;
    }

    @Override
    public Response get(String endpoint) {
        return RestAssured.get(endpoint);
    }
}
