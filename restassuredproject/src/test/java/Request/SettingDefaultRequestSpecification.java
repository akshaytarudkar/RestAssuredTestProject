package Request;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SettingDefaultRequestSpecification {

	@BeforeClass
	public void SetupDefault()
	{
	/*Using given() to create Request Specification*/
	RequestSpecification objreq1= RestAssured.given();
	/*Base URI*/
	objreq1.baseUri("https://reqres.in/api/users");
	/*Base Path*/
	objreq1.basePath("/2");

	RestAssured.requestSpecification = objreq1;
	}


	@Test
	public void UseDefault()
	{
	/*Use default RequestSpecification*/
	Response res = RestAssured.when().get();
	System.out.println("Response for default: "+res.asString());
	}

	@Test
	public void OverrideDefault()
	{
	/*Using with() to create request specification*/
	RequestSpecification objreq2= RestAssured.with();
	/*Base URI*/
	objreq2.baseUri("https://reqres.in/api");
	/*Base Path*/
	objreq2.basePath("/users?page=3");
	/*Override default Request Specification*/
	Response res = RestAssured.given().spec(objreq2).get();
	System.out.println("Response for overriding: "+res.asString());
	}
	
}
