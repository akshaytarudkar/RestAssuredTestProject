package oopsImplememtation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutRequest {

	public void sendPutRequest() {
        // Sending a PUT request and printing the response
        Response response = RestAssured.given().contentType("application/json")
                .body("{\"id\": 1, \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}")
                .put("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println("PUT Response:\n" + response.asString());
    }
}
