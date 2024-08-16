package IgnoreUnkonwnProperties;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonIgnoreProperties(ignoreUnknown = true)

public class IgnoreUnkownJsonProperties {

	private String badmintion;
	private String brand;
	
	public String getBadmintion() {
		return badmintion;
	}
	public void setBadmintion(String badmintion) {
		this.badmintion = badmintion;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	   @Test
      public void missingunknown() throws JsonMappingException, JsonProcessingException {
	
    	  String batmintonstring="{\r\n"
    	  		+ "				 \"badmintion\" : \"Yonex\" ,\r\n" +
    	  		"  \"brand\" : \"Voltric 50 E-tune\" , \r\n" +
    	  		"  \"racketName\" : \"Voltric 50 E-tune\" \r\n" +
    	  		"}";
    	  ObjectMapper Objmap=new ObjectMapper();
    	  IgnoreUnkownJsonProperties classobj=Objmap.readValue(batmintonstring, IgnoreUnkownJsonProperties.class);
    	  System.out.println("Deserilaization");
    	  System.out.println("bat: " + classobj.getBadmintion());
    	  System.out.println("brand: " + classobj.getBrand());
    	  		
    	  
}}