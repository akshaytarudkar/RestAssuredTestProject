package pojoExample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example2 {

	public static void main(String[] args) throws JsonProcessingException {

		Flight obj= new Flight();
		obj.setFirstName("Akshay");
		obj.setLastName("Tarudkar");

		//yyyy-MM-dd is default format 
		LocalDate currentDate = LocalDate.now();

		// Get 5 days from current date
   		obj.setDepartureDate(currentDate.plusDays(5).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
   		
		// Get 15 days from current date
		obj.setReturndate(currentDate.plusDays(15).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		
		// conversion- POJO to JSON
		ObjectMapper objMapper = new ObjectMapper();
		String str = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(str);

		// conversion- JSON to POJO
		Flight newObj = objMapper.readValue(str, Flight.class);
		System.out.println("Flight departure date: "+ newObj.getDepartureDate());
		System.out.println("Flight return date: "+ newObj.getReturndate());
	}
	
}
