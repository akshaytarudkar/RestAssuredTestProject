package restassuredIntermidiate;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOClassJSONArrayPayload {

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

	public String allPOJOClassJSONPayload;

	@Test
	public void CreateList() throws JsonProcessingException {

	/* Badminton Detail - 1*/
	POJOClassJSONArrayPayload yonex = new POJOClassJSONArrayPayload();
	yonex.setBadmintonBrand("Yonex");
	yonex.setRacketName("Voltric 50 E-Tune");

	/* Badminton Detail - 2*/
	POJOClassJSONArrayPayload lining = new POJOClassJSONArrayPayload();
	lining.setBadmintonBrand("Lining");
	lining.setRacketName("Woods N-90");

	/* Badminton Detail - 3*/
	POJOClassJSONArrayPayload victor = new POJOClassJSONArrayPayload();
	victor.setBadmintonBrand("Victor");
	victor.setRacketName("Ryuga");

	/* Creating List*/
	List<POJOClassJSONArrayPayload> allBadmintonDetails = new ArrayList<POJOClassJSONArrayPayload>();
	allBadmintonDetails.add(yonex);
	allBadmintonDetails.add(lining);
	allBadmintonDetails.add(victor);

	/*Class Object -> String(JSON Array PAYLOAD)*/
	ObjectMapper objMap3r = new ObjectMapper();
	allPOJOClassJSONPayload = objMap3r.writerWithDefaultPrettyPrinter().writeValueAsString(allBadmintonDetails);
	System.out.println(allPOJOClassJSONPayload);

	/*String(JSON Array PAYLOAD) -> Class Object*/
	ObjectMapper objMap3r2 = new ObjectMapper();
	List<POJOClassJSONArrayPayload> allBaddyDetails = objMap3r2.readValue(allPOJOClassJSONPayload,
	new TypeReference<List<POJOClassJSONArrayPayload>>() {
	});

	for (POJOClassJSONArrayPayload bad : allBaddyDetails) {
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("Badminton Brand : " + bad.getBadmintonBrand());
	System.out.println("Racket Name : " + bad.getRacketName());

	}
	}

	
	
}
