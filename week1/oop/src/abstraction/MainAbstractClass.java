package abstraction;

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
	@Override
    public void makeSound() {
        System.out.println("gâu gâu");
    }
}

class Cat extends Animal {
	@Override
    public void makeSound() {
        System.out.println("meo meo");
    }
}

public class MainAbstractClass {
	public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.sleep(); 
        cat.sleep(); 
    }
}
