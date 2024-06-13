package EncapsulationPractise;

public class MainMethod {
   
	public static void main(String[] args) {
		
		Person person=new Person("akshay", 30);
		
		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
		
		person.setName("Bob");
		person.setAge(35);
		
		System.out.println("Updated Name: " + person.getName());
		System.out.println("Updated age:" + person.getAge());
		
		person.setAge(-36);
	}
}
