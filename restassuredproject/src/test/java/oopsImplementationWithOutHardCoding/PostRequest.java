package oopsImplementationWithOutHardCoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

	public void sendPostRequest(String url, String requestBody) {
        // Sending a POST request and printing the response
        Response response = RestAssured.given().contentType("application/json")
                .body(requestBody)
                .post(url);
        System.out.println("POST Response:\n" + response.asString());
    }	
	
}
