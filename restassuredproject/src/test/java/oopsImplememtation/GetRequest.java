package oopsImplememtation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	 public void sendGetRequest() {
	        // Sending a GET request and printing the response
	        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
	        System.out.println("GET Response:\n" + response.asString());
	    }
	
}
