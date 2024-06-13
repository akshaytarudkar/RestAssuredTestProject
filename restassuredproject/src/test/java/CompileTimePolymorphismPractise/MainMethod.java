package CompileTimePolymorphismPractise;

public class MainMethod {

	public static void main(String[] args) {
		MathOperation mathop=new MathOperation();
		System.out.println("ADD two int:" + mathop.add(5, 5));
		System.out.println("add three int:" + mathop.add(5, 5, 5));
		System.out.println("add of two double:" + mathop.add(55.5, 55.5));
	}

}
