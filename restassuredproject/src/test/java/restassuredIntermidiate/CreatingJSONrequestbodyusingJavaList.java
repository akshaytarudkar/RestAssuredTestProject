package restassuredIntermidiate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatingJSONrequestbodyusingJavaList {

	@Test
    public void CreatingJSONObjectTest() {
        // JSON Object
        Map<String,String> authorizationPayload = new HashMap<String, String>();
        authorizationPayload.put("username", "CodingNinjas");
        authorizationPayload.put("password", "ninjas@123");

        Map<String,String> detailsPayload = new HashMap<String, String>();
        detailsPayload.put("firstname", "Coding");
        detailsPayload.put("lastname", "Ninjas");
        detailsPayload.put("city", "Noida");

        // Creating JSON array to add both JSON objects
        List<Map<String, String>> arrayJSONPayload = new ArrayList<>();

        arrayJSONPayload.add(authorizationPayload);
        arrayJSONPayload.add(detailsPayload);

        // GIVEN
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .contentType(ContentType.JSON)
                .body(arrayJSONPayload)
                .log()
                .all()

                // WHEN
                .when()
                .post()

                // THEN
                .then()
                .assertThat()

                // Putting status code as 500 
                .statusCode(500)
                .log()
                .all();
    }
}
