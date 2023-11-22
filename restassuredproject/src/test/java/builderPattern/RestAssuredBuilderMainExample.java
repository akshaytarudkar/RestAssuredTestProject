package builderPattern;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.CoreMatchers.*;

public class RestAssuredBuilderMainExample {

	 public static void main(String[] args) {
	        RequestSpecBuilderExample builder = new RequestSpecBuilderExample()
	                .setBaseURI("https://jsonplaceholder.typicode.com")
	                .setBasePath("/posts")
	                .setContentType("application/json");

	        RequestSpecification requestSpec = builder.build();

	        RestAssured.given()
	                .spec(requestSpec)
	                .when()
	                .get()
	                .then()
	                .log().all()
	                .assertThat()
	                .statusCode(200)
	                ;
	    }
}
