package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONusingJACKSON {
	@Test
	public void CreatingNestedJsonObjectTest() throws JsonProcessingException
	{
	/* Create an object to ObjectMapper*/
	ObjectMapper ObjMap3r = new ObjectMapper();

	
	ObjectNode application = ObjMap3r.createObjectNode();
	application.put("firstname", "Mayank");
	application.put("lastname", "Goyal");
	application.put("totalfees", 100000);
	application.put("depositpaid", true);	
	application.put("department", "CS");
	
	String createdPlainJsonObject = ObjMap3r.writerWithDefaultPrettyPrinter().writeValueAsString(application);
	System.out.println("Created plain JSON Object is : \n"+ createdPlainJsonObject);
	                 }
}
