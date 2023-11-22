package interfaceInRestAssured;

import io.restassured.response.Response;

public class main {

	public static void main(String[] args) {
        // Creating an instance of the RestClientImplementation using the RestClientInterface
        RestClientInterface restClient = new RestClientImplementation();

        // Setting the base URI and port using the implemented method
        restClient.setBaseURI("https://jsonplaceholder.typicode.com", 443);

        // Sending a GET request using the implemented method
        Response response = restClient.get("/posts");

        // Printing the response status code and body
        System.out.println("Response status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());
    }
}
