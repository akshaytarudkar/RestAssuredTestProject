package InheritancePractise;

public class MainMethod {

	public static void main(String[] args) {
		// Create an instance of Animal
		Animal genericAnimal=new Animal("Generic animal");
		genericAnimal.makesound();    // Output: Some generic animal sound
		genericAnimal.displayinfo();   // Output: Name: Generic Animal
		
		// Create an instance of Dog
		Dog dog=new Dog("Buddy");
		dog.makesound();          // Output: Bark
        dog.displayinfo();        // Output: Name: Buddy
	}

}
