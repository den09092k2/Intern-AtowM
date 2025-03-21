package polymorphism;

public class Overloading {
	
	public static int sum(int a,int b) {
		return a + b;
	}
	
	public static int sum(int a) {
		return a ;
	}
	public static int sum() {
		return 0;
	}
	
	public static double sum(double a,double b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2));
		System.out.println(sum());
		System.out.println(sum(2.1,3.2));
	}
}
