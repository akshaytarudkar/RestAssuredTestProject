package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IgnoreUnknownPropertiesObjMap3r {

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
	public void MissingProperties() throws JsonMappingException, JsonProcessingException {
		
		String badmintonString = "{\r\n" +
				"  \"badmintonBrand\" : \"Yonex\",\r\n" +
				"  \"racketName\" : \"Voltric 50 E-tune\",\r\n" +
				"  \"sponsors\" : \"TotalEnergies\"\r\n" +
				"}";
		
		ObjectMapper objMap3r = new ObjectMapper();
		objMap3r.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		IgnoreUnknownPropertiesObjMap3r ClassObj = objMap3r.readValue(badmintonString, IgnoreUnknownPropertiesObjMap3r.class);
		System.out.println("Deserialization...Ignoring Unknown Properties");
		System.out.println("Badminton Brand : "+ClassObj.getBadmintonBrand());
		System.out.println("Racket Name: "+ClassObj.getRacketName());
	}
}
