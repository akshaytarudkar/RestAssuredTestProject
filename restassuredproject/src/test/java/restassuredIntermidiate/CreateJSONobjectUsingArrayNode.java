package restassuredIntermidiate;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateJSONobjectUsingArrayNode {

	@Test
	public void CreatingNestedJsonObjectTest() throws JsonProcessingException
	{
	/* Create an object to ObjectMapper*/
	ObjectMapper objectMapper = new ObjectMapper();

	/* Create an array that will hold two JSON objects*/
	ArrayNode parentArray = objectMapper.createArrayNode();



	/* Creating Node that maps to JSON Object structures in JSON content*/
	ObjectNode firstapplication = objectMapper.createObjectNode();

	/* Similar to the map put approach. The put method can accept too many data types as field values.*/


	/* String as field value*/
	firstapplication.put("firstname", "Mayank");
	firstapplication.put("lastname", "Goyal");


	/* integer as field value*/
	firstapplication.put("totalfees", 100000);


	/* boolean as field value
	firstapplication.put("depositpaid", true);


	firstapplication.put("department", "IT");


	/*We create a nested JSON Object*/
	ObjectNode firstsession = objectMapper.createObjectNode();
	firstsession.put("startdate", "2021-07-01");
	firstsession.put("enddate", "2021-07-01");

	/* We use either set(String fieldName, JsonNode value) or replace(String fieldName, JsonNode value)*/
	firstapplication.set("sessiondates", firstsession);

	ObjectNode secondapplication = objectMapper.createObjectNode();

	/* Similar to the map put approach. The put method can accept too many data types as field values.*/


	/*String as field value*/
	secondapplication.put("firstname", "Debojeet");
	secondapplication.put("lastname", "Jha");


	/*integer as field value*/
	secondapplication.put("totalfees", 5000);


	/* boolean as field value*/
	secondapplication.put("depositpaid", true);


	secondapplication.put("department", "IT");


	/* We create a nested JSON Object*/
	ObjectNode secondsession = objectMapper.createObjectNode();
	secondsession.put("startdate", "2021-07-01");
	secondsession.put("enddate", "2021-07-01");

	/* We use either set(String fieldName, JsonNode value) or replace(String fieldName, JsonNode value)*/
	secondapplication.set("sessiondates", secondsession);


	parentArray.addAll(Arrays.asList(firstapplication,secondapplication));
	        
	/*To print created JSON array as a string with the proper format*/
	String jsonArrayAsString =  objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(parentArray);
	System.out.println("Created JSON Array is : ");
	System.out.println(jsonArrayAsString);


	}
}
