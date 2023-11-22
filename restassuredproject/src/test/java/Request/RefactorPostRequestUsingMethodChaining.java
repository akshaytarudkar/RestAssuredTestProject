package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RefactorPostRequestUsingMethodChaining {
	
	public static void main(String args[]) {
		  
		
		// Setup REQUEST
		RestAssured
		         .given()
		         .log()
		         .all()
		         .baseUri("https://restful-booker.herokuapp.com")
		         .basePath("booking")
		         .body("{\r\n"
		 				+ "    \"firstname\" : \"AKS\",\r\n"
		 				+ "    \"lastname\" : \"TARU\",\r\n"
		 				+ "    \"totalprice\" : 180,\r\n"
		 				+ "    \"depositpaid\" : true,\r\n"
		 				+ "    \"bookingdates\" : {\r\n"
		 				+ "        \"checkin\" : \"2018-01-01\",\r\n"
		 				+ "        \"checkout\" : \"2019-01-01\"\r\n"
		 				+ "    },\r\n"
		 				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
		 				+ "} ")
		         .contentType(ContentType.JSON)
		         
		         //Hit the request and get the response
		         .post()
		         
		         //Validate the response
		         .then()
		         .log()
		         .all()
		         .statusCode(200);
		         
}}
