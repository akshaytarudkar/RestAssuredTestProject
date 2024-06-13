package InheritancePractise;

public class Animal {

	 String name;
	 
	 Animal(String name){
		 this.name=name;
	 }
	 
	 void makesound() {
		 System.out.println("Some animal make sound :");
	 }
	 
	 void displayinfo() {
		 System.out.println("Name : "  +  name );
	 }
}
