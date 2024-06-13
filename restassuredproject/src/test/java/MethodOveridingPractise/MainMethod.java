package MethodOveridingPractise;

public class MainMethod {

	 public static void main(String[] args) {
		// Creating an object of Animal class
		 Animal myanimal=new Animal();
		 myanimal.makesound();
		 
		  // Creating an object of Dog class
	        Dog myDog = new Dog();
	        myDog.makesound();  // Output: Dog barks

	        // Using a reference of Animal type to refer to a Dog object
	        Animal myPet = new Dog();
	        myPet.makesound();  // Output: Dog barks (runtime polymorphism)
	}
}
