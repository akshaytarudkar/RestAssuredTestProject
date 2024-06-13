package RunTimePolymorphismPractise;

public class MainMethod {

	public static void main(String[] args) {
		Animal myanimal=new Animal();  // Animal reference and object
		Animal mydog=new Dog();        //  Animal reference but dog object
        Animal mycat=new cat();       //Animal reference but cat object
        
        myanimal.sound();   //call the method in animal class
        mydog.sound();      //call the overridden method in dog class
        mycat.sound();      //call the overridden method in cat class
	}

}
