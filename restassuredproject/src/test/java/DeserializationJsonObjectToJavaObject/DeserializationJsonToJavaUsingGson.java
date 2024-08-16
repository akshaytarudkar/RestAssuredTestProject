package DeserializationJsonObjectToJavaObject;

import com.google.gson.Gson;

import pojoExample.student;

public class DeserializationJsonToJavaUsingGson {

	public static void main(String[] args) {
		
		String jsonstring=" {\r\n"
				+ "  \"firstName\": \"Akshay\",\r\n"
				+ "  \"lastName\": \"Tarudkar\",\r\n"
				+ "  \"subject\": \"Data structures and algorithms\",\r\n"
				+ "  \"school\": \"Coding Ninjas\"\r\n"
				+ "}";
		Gson gson=new Gson();
		Student student1=gson.fromJson(jsonstring,Student.class);
		String firstname=student1.getFirstName();
		String lastname=student1.getLastName();
		String subject=student1.getSubject();
		String school=student1.getSchool();
		
		System.out.println("Detail of student");
		System.out.println("firtsname : " + firstname);
		System.out.println("lastname : "+lastname);
		System.out.println("subject : "+subject);
		System.out.println("school : "+school);
	}
}
