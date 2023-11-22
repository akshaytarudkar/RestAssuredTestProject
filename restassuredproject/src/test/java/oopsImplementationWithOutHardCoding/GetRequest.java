package oopsImplementationWithOutHardCoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*; 

public class GetRequest {

	public void sendGetRequest(String url) {
        // Sending a GET request and printing the response
        Response response = RestAssured.get(url);
        System.out.println("GET Response:\n" + response.asString());
    }
}
