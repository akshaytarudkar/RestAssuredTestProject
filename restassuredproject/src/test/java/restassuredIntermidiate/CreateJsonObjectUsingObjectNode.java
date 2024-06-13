package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateJsonObjectUsingObjectNode {
	
	@Test
	public void CreatingNestedJsonObjectTest() throws JsonProcessingException
	{
	
	ObjectMapper ObjMap3r = new ObjectMapper();


	ObjectNode application = ObjMap3r.createObjectNode();

	application.put("firstname", "Mayank");
	application.put("lastname", "Goyal");
	application.put("totalfees", 100000);
	​application.put("depositpaid", true);
	​application.put("department", "CS");
	String createdPlainJsonObject = ObjMap3r.writerWithDefaultPrettyPrinter().writeValueAsString(application);
	System.out.println("Created plain JSON Object is : \n"+ createdPlainJsonObject);		
	ObjectNode session = ObjMap3r.createObjectNode();
	session.put("startdate", "2022-11-04");
	session.put("enddate", "2022-11-05");
	application.set("sessiondates", session);	
	
	String createdNestedJsonObject = ObjMap3r.writerWithDefaultPrettyPrinter().writeValueAsString(application);	​
	System.out.println("Created nested JSON Object is : \n"+ createdNestedJsonObject);
	
	}
}
