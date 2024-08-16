package jsonIgnoreProperty;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialization {

	private String badmintonBrand;
	@JsonIgnore
	private String racketName;
		
	
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
		
		
		SerializationDeserialization objpojo = new SerializationDeserialization();
		
		
		objpojo.setBadmintonBrand("Yonex");
		objpojo.setRacketName("Voltric 50 E-tune");
		
		/*Class Object -> String(JSON Object PAYLOAD)*/
		System.out.println("Serialization...");
		ObjectMapper objectMapper = new ObjectMapper();
		String objpojoJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objpojo);
		System.out.println(objpojoJson);
		
		/*String(JSON Object PAYLOAD) -> Class Object*/
		System.out.println("DeSerialization...");
		SerializationDeserialization objpojo2 = objectMapper.readValue(objpojoJson, SerializationDeserialization.class);
		System.out.println("Badminton Brand : "+objpojo2.getBadmintonBrand());
		System.out.println("Racket Name : "+objpojo2.getRacketName());
	}

}
