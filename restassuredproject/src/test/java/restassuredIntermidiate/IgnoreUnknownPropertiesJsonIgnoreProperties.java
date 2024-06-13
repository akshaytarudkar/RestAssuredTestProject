package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonIgnoreProperties(ignoreUnknown = true)

public class IgnoreUnknownPropertiesJsonIgnoreProperties {

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
        IgnoreUnknownPropertiesJsonIgnoreProperties ClassObj = objMap3r.readValue(badmintonString, IgnoreUnknownPropertiesJsonIgnoreProperties.class);
        System.out.println("Deserialization...Ignoring Unknown Properties");
        System.out.println("Badminton Brand : "+ClassObj.getBadmintonBrand());
        System.out.println("Racket Name: "+ClassObj.getRacketName());
    }

}
