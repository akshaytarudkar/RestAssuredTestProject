package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequestInRestAssured {
	
	public static void main(String[] args) {
		
		/*RequestSpecification requestspecification = RestAssured.given().log().all();
		requestspecification.baseUri("https://restful-booker.herokuapp.com");
		requestspecification.basePath("booking/{id}");
		requestspecification.pathParam("id", 1);
		Response response= requestspecification.get();
		ValidatableResponse validatableResponse= response.then().log().all();
		validatableResponse.statusCode(200); */
		
		RestAssured
		           .given()
		           .log()
		           .all()
		           .baseUri("https://restful-booker.herokuapp.com")
		           .basePath("booking/{id}")
		           .pathParam("id", 1)
		           
		           .when()
		           .get()
		            
		             .then()
		             .log()
		             .all()
		             .statusCode(200);
	}

}
