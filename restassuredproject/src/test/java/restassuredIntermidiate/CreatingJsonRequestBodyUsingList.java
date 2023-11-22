package restassuredIntermidiate;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatingJsonRequestBodyUsingList {

	
	 @Test
	    public void postRequestWithJsonArray() {
	        // Create a List of objects
	        List<String> hobbies = new ArrayList<>();
	        hobbies.add("Reading");
	        hobbies.add("Gardening");

	        // Use RestAssured to send the request
	        RestAssured.
	        given()
	            .contentType(ContentType.JSON)
	            .body(hobbies)
	        .when()
	            .post("https://jsonplaceholder.typicode.com/posts") // Using a dummy API endpoint for demonstration
	        .then()
	            .statusCode(201); // Customize the expected status code
	    }
}
