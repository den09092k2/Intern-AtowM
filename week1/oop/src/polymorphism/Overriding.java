package polymorphism;

class Person {
	  
    
    void role() {
        System.out.println("I am a person.");
    }
}

class Father extends Person {

    @Override
    void role() {
        System.out.println("I am a father.");
    }
}

public class Overriding {
	public static void main(String[] args) {
		 // Creating a reference of type Person 
	    // but initializing it with Father class object
	    Person p = new Father();
	    
	    // Calling the role method. It calls the 
	    // overridden version in Father class
	    p.role();
	}
	
      
}	
