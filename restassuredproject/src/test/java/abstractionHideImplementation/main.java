package abstractionHideImplementation;

import io.restassured.response.Response;

public class main {

	public static void main(String[] args) {
        // Creating an instance of the RestClient with abstraction
        RestClient restClient = new RestClient("http://jsonplaceholder.typicode.com", 80);

        // Sending a GET request using the RestClient
        Response response = restClient.get("/posts");

        // Printing the response status code and body
        System.out.println("Response status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());
    }
}
