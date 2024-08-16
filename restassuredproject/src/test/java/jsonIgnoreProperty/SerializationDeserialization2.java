package jsonIgnoreProperty;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(value = {"racketName"}, allowSetters = true)
public class SerializationDeserialization2 {

	
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
	public void Serialization_Deserialization() throws JsonProcessingException {
		
		/*Creating object of class*/
		SerializationDeserialization2 objpojo = new SerializationDeserialization2();
		
		/*Set Values*/
		objpojo.setBadmintonBrand("Yonex");
		objpojo.setRacketName("Voltric 50 E-tune");
		
		/*Class Object -> String(JSON Object PAYLOAD)*/
		System.out.println("Serialization...");
		ObjectMapper objectMapper = new ObjectMapper();
		String objpojoJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objpojo);
		System.out.println(objpojoJson);
		
		/*String(JSON Object PAYLOAD) -> Class Object*/
		System.out.println("DeSerialization...");
		SerializationDeserialization2 objpojo2 = objectMapper.readValue(objpojoJson, SerializationDeserialization2.class);
		System.out.println("Badminton Brand : "+objpojo2.getBadmintonBrand());
		System.out.println("Racket Name : "+objpojo2.getRacketName());
	}
}
