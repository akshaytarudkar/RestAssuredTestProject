package oopsImplementationWithOutHardCoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutRequest {

	public void sendPutRequest(String url, String requestBody) {
        // Sending a PUT request and printing the response
        Response response = RestAssured.given().contentType("application/json")
                .body(requestBody)
                .put(url);
        System.out.println("PUT Response:\n" + response.asString());
    }
	
}
