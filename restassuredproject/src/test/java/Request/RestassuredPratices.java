package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestassuredPratices {

	public static void main(String[] args) {
		
	
	
		RestAssured.given()
		            .log()
		            .all()
                   .baseUri("https://rahulshettyacademy.com") 
                	   .basePath("maps/api/place/add/json?key=")
                	   .body("{\n" +
                               "    \"location\": {\n" +
                               "        \"lat\": -38.383494,\n" +
                               "        \"lng\": 33.427362\n" +
                               "    },\n" +
                               "    \"accuracy\": 50,\n" +
                               "    \"name\": \"Ajit house\",\n" +
                               "    \"phone_number\": \"(+91) 983 893 3937\",\n" +
                               "    \"address\": \"30, side layout, cohen 09\",\n" +
                               "    \"types\": [\n" +
                               "        \"shoe park\",\n" +
                               "        \"shop\"\n" +
                               "    ],\n" +
                               "    \"website\": \"http://google.com\",\n" +
                               "    \"language\": \"French-IN\"\n" +
                               "}" )
                	   .contentType(ContentType.JSON)
               
                	   .post()
                	   .then()
                	   .log()
                	   .all()
                	   .statusCode(200);
		
	}

}	
	

