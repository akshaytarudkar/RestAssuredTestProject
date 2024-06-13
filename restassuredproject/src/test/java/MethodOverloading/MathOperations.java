package MethodOverloading;

public class MathOperations {

   static int add(int a, int b) 
	{
		return a+b;
	}
	
	static  int add(int a, int b, int c) 
	{
		return a+b+c;
	}
	
	 static double add(double a, double b) 
	{
		return a+b;
	}
	
	    public static void main(String[] args) {
	        MathOperations math = new MathOperations();
	        System.out.println("Sum of 2 and 3: " + math.add(2, 3)); // Calls add(int, int)
	        System.out.println("Sum of 1, 2 and 3: " + math.add(1, 2, 3)); // Calls add(int, int, int)
	        System.out.println("Sum of 1.5 and 2.5: " + math.add(1.5, 2.5)); // Calls add(double, double)
	    }
	
}
