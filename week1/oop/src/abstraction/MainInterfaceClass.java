package abstraction;

interface Animal1 {
	//Phuong thuc tru tuong
    void makeSound();
    //phuong thuc mac dinh
    default void eat() {
    	System.out.println("Eating food");
    }
    //Phuong thuc tinh
    static void sleep() {
    	System.out.println("Zzzz");
    }
}

class Dog1 implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    public void eat() {
    	System.out.println("Dog is eating food");
    }
    
    static void sleep() {
    	System.out.println("Dog is sleeping");
    }
    
}

public class MainInterfaceClass {
	 public static void main(String[] args) {
		 Dog1 dog = new Dog1();
	        dog.makeSound(); 
	        dog.eat();
	        dog.sleep();
	        Animal1.sleep();
	        
	}
}
