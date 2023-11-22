package pojoExample;

import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example1 {

	public static void main(String[] args) throws JsonProcessingException {

		Flight obj = new Flight();
		obj.setFirstName("AKSHAY");
		obj.setLastName("TARUDKAR");

		// yyyy-MM-dd is the default format 
		LocalDate currentDate = LocalDate.now();

		// Get 5 days from current date
		obj.setDepartureDate(currentDate.plusDays(5).toString());


		// Get 15 days from current date
		obj.setReturndate(currentDate.plusDays(15).toString());

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
