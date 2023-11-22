package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBookingPostRequest {

	public static void main(String args[]) {
	  
		//POST Request in RestAssured
		//Build Request
		RequestSpecification requestSpecification= RestAssured.given();
		requestSpecification=requestSpecification.log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
		requestSpecification.basePath("booking");
		requestSpecification.body("{\r\n"
				+ "    \"firstname\" : \"AKS\",\r\n"
				+ "    \"lastname\" : \"TARU\",\r\n"
				+ "    \"totalprice\" : 180,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "} ");
		requestSpecification.contentType(ContentType.JSON);
		
		//Hit Request & Get the response
		Response response=requestSpecification.post();
		
		//Validate the Response
		ValidatableResponse validatableResponse= response.then();
		validatableResponse.statusCode(200);
		
}}
