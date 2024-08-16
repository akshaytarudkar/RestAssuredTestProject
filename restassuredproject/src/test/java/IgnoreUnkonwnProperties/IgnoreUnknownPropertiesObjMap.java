package IgnoreUnkonwnProperties;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import restassuredIntermidiate.IgnoreUnknownPropertiesObjMap3r;

public class IgnoreUnknownPropertiesObjMap {

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
public void missingproperties() throws JsonMappingException, JsonProcessingException {
	String badmintonString= "{\r\n" +
			"  \"badminton\" : \"Yonex\",\r\n" +
			"  \"brand\" : \"Voltric 50 E-tune\",\r\n" +
			"  \"sponsors\" : \"TotalEnergies\"\r\n" +
			"}";
	ObjectMapper objMap3r = new ObjectMapper();
	objMap3r.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	IgnoreUnknownPropertiesObjMap ClassObj = objMap3r.readValue(badmintonString, IgnoreUnknownPropertiesObjMap.class);
	System.out.println("Deserialization...Ignoring Unknown Properties");
	System.out.println("Badminton Brand : "+ClassObj.getBadminton());
	System.out.println("Brand: "+ClassObj.getBrand());

	
}}
