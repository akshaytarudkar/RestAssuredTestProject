package DeserializationJsonObjectToJavaObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationJsonToJava {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonstring="{\r\n"
				+ "  \"firstName\": \"Akshay\",\r\n"
				+ "  \"lastName\": \"Tarudkar\",\r\n"
				+ "  \"subject\": \"Data structures and algorithms\",\r\n"
				+ "  \"school\": \"Coding Ninjas\"\r\n"
				+ "}";
		
	ObjectMapper objmapper=new ObjectMapper();
	Student stuobj=objmapper.readValue(jsonstring, Student.class);
	String firstname=stuobj.getFirstName();
	String LastName=stuobj.getLastName();
	String subject=stuobj.getSubject();
	String school=stuobj.getSchool();
	
	System.out.println("Firstname="+firstname);
	System.out.println("lastname="+LastName);
	System.out.println("subject="+subject);
	System.out.println("school="+school);
	
	}
}
