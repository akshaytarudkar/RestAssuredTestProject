package oopsImplememtation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

	public void sendPostRequest() {
        // Sending a POST request and printing the response
        Response response = RestAssured.given().contentType("application/json")
                .body("{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}")
                .post("https://jsonplaceholder.typicode.com/posts");
        System.out.println("POST Response:\n" + response.asString());
    }
	
}
