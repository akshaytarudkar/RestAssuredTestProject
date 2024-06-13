package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOClassJSONObjectPayload {

	/*Data members*/
	private String badmintonBrand;
	private String racketName;

	/*Getters and Setters*/
	public String getBadmintonBrand() {
	return badmintonBrand;
	}

	public void setBadmintonBrand(String badmintonBrand){
	this.badmintonBrand = badmintonBrand;
	}

	public String getRacketName() {
	return racketName;
	}

	public void setRacketName(String racketName) {
	this.racketName = racketName;
	}

	@Test
	public void BadmintonJSONFromPOJOClass() throws JsonProcessingException {

	/*Creating object of class*/
	POJOClassJSONObjectPayload objpojo = new POJOClassJSONObjectPayload();

	/*Set Values*/
	objpojo.setBadmintonBrand("Yonex");
	objpojo.setRacketName("Voltric 50 E-tune");

	/*Class Object -> String(JSON Object PAYLOAD)*/
	ObjectMapper objectMapper = new ObjectMapper();
	String objpojoJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objpojo);
	System.out.println(objpojoJson);

	/*String(JSON Object PAYLOAD) -> Class Object*/
	POJOClassJSONObjectPayload objpojo2 = objectMapper.readValue(objpojoJson, POJOClassJSONObjectPayload.class);
	System.out.println("Badminton Brand : "+objpojo2.getBadmintonBrand());
	System.out.println("Racket Name : "+objpojo2.getRacketName());

	}



	
}
