package restassuredIntermidiate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class JSONcreationExample {

	 public static void main(String[] args) {
	        // Create an instance of ObjectMapper from the Jackson API
	        ObjectMapper objectMapper = new ObjectMapper();

	        // Create a JSON ObjectNode using the createObjectNode() method
	        ObjectNode objectNode = objectMapper.createObjectNode();
	        objectNode.put("name", "John Doe");
	        objectNode.put("age", 30);
	        objectNode.put("email", "johndoe@example.com");

	        // Convert the ObjectNode to a JSON string
	        String jsonString = objectNode.toString();

	        // Use RestAssured to send the JSON object
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Example base URI
	        RestAssured.given()
	            .contentType(ContentType.JSON)
	            .body(jsonString)
	            .when()
	            .post("/posts") // Example endpoint
	            .then()
	            .statusCode(201); // Example expected status code
	    }
	}