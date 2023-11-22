package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DefaultHostAndPort {

	 public static void main(String[] args) {
	        // Setting the default base URI and port for all requests
	        RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
	        RestAssured.port = 80;

	        // Sending a GET request to the /posts endpoint
	        Response response = RestAssured.get("/posts/1/comments");

	        // Printing the response status code and body
	        System.out.println("Response status code: " + response.getStatusCode());
	        System.out.println("Response body: " + response.getBody().asString());
	    }
}
