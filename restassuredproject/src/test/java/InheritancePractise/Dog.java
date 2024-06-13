package InheritancePractise;

public class Dog extends Animal {

	Dog(String name){
		super(name);
	}
	@Override
	void makesound() {
		System.out.println("Bark");
	}
}
