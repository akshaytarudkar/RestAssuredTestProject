package MethodOverloading;

public class overloadingexample {

	public static void main(String[] args) {
		MathOperations math=new MathOperations();
		System.out.println("add is: " + math.add(5, 5));
		System.out.println("addition : " + math.add(8, 8, 9));
		System.out.println("double add :" + math.add(2.3, 5.3));
	
		}
}
