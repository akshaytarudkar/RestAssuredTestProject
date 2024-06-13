package restassuredIntermidiate;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class creatingJSONrequestbodyusingMap {

	@Test
    public void bodyAsMap() {
        Map<String, String> authorizationPayload = new HashMap<String, String>();
        authorizationPayload.put("username", "CodingNinjas");
        authorizationPayload.put("password", "ninjas@123");
        authorizationPayload.put("firstname", "Coding");
        authorizationPayload.put("lastname", "Ninjas");

        // GIVEN
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .contentType(ContentType.JSON)
                .body(authorizationPayload)
                .log()
                .all()

                // WHEN
                .when()
                .post()

                // THEN
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();

    }

}

