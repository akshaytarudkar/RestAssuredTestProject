package pojoExample;

public class Demo {

	 public static void main(String[] args) {  
	        
	        // Create a Student class object  
	         student stu= new student();
	   
	         // Using the set() method to set the values
	         stu.setName("AKSHAY");  
	         stu.setRoll("224");  
	         stu.setMarks(80);  


	         // Using the get() method to get the values
	          System.out.println("Name: "+ stu.getName()); 
	          System.out.println("Roll: " + stu.getRoll());  
	          System.out.println("Marks: " +stu.getMarks());  
	     }  
}
