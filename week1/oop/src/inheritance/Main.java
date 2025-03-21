package inheritance;

class Animal {
	private int tuoi;
	
	public void ngu() {
		System.out.println("Animal đang ngủ");
	}
	
	public void an() {
		System.out.println("Animal đang ăn");
	}
}

class Dog extends Animal{
	
}

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.ngu();
		d.an();
	}
}
