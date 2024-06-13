package restassuredIntermidiate;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
import java.io.File;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PassJsonAsPayload {
	@Test
    public void createUser() {
 
        // Creating a File instance
        File jsonData = new File("/restassuredproject/src/test/resources/Payload/jsondemo.json");
 
        // GIVEN
        given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(jsonData)
 
                // WHEN
                .when()
                .post("/api/users")
 
                // THEN
                .then()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo("Json_Test"))
                .body("job", equalTo("Leader"))
                .log().all();
 
    }

}
