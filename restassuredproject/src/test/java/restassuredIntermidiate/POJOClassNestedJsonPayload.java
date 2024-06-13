package restassuredIntermidiate;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOClassNestedJsonPayload {
public class ElitePlayers{
	/*Data Members*/
	private String governingBody;
	private String hostingCity;
	private String sponsors;
	ElitePlayers elitePlayers;


	/*Getter and Setter Methods*/
	public String getGoverningBody() {
	return governingBody;
	}

	public void setGoverningBody(String governingBody) {
	this.governingBody = governingBody;
	}

	public String getHostingCity() {
	return hostingCity;
	}

	public void setHostingCity(String hostingCity) {
	this.hostingCity = hostingCity;
	}

	public String getSponsors() {
	return sponsors;
	}

	public void setSponsors(String sponsors) {
	this.sponsors = sponsors;
	}

	public ElitePlayers getElitePlayers() {
	return elitePlayers;
	}

	public void setElitePlayers(ElitePlayers elitePlayers) {
	this.elitePlayers = elitePlayers;
	}

	public class CreateNestedJSONFromPOJOClasses {

	@Test

	public void function() throws JsonProcessingException {
	POJOClassNestedJsonPayload nestedPOJO = new POJOClassNestedJsonPayload();
	nestedPOJO.setGoverningBody("BWF");
	nestedPOJO.setHostingCity("Tokyo");
	nestedPOJO.setSponsors("TotalEnergies");
	ElitePlayers elitePlayers = new ElitePlayers();
	elitePlayers.setMS("LIN DAN");
	elitePlayers.setWS("P V SINDHU");
	nestedPOJO.setElitePlayers(elitePlayers);

	/*Class Object -> String(Nested JSON PAYLOAD)*/
	ObjectMapper objMap3r = new ObjectMapper();
	String nestedJsonPayload = objMap3r.writerWithDefaultPrettyPrinter().writeValueAsString(nestedPOJO);
	System.out.println(nestedJsonPayload);

	/*String(Nested JSON PAYLOAD) -> Class Object*/
	POJOClassNestedJsonPayload objpojo2 = objMap3r.readValue(nestedJsonPayload, POJOClassNestedJsonPayload.class);
	System.out.println("Elite Player[WS] : "+objpojo2.getElitePlayers().getClass());

	}
	}

}	
	
	
	
	
	
	
	
	
	
	