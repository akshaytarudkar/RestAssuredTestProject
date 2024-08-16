package IntermidiatePractise;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOclassJsonObjectPayload {

	private String Badminton;
	private String brand;
	public String getBadminton() {
		return Badminton;
	}
	public void setBadminton(String badminton) {
		Badminton = badminton;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Test
	public void  badmintonJsonFromPojoClass() throws JsonProcessingException
	{
		POJOclassJsonObjectPayload objpojo= new POJOclassJsonObjectPayload();
		objpojo.setBadminton("yonex");
		objpojo.setBrand("Voltic 50");
		
		ObjectMapper objectmapper= new ObjectMapper();
		String objpojojson=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(objpojo);
		System.out.println(objpojojson);
		
		POJOclassJsonObjectPayload objpojo2= objectmapper.readValue(objpojojson, POJOclassJsonObjectPayload.class);
		System.out.println("BATMINTON" + objpojo2.getBadminton());
		System.out.println("Brand"+ objpojo2.getBrand());
		
	}
	
}
