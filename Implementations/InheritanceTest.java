class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); 

        Dog dog = new Dog();
        dog.makeSound();        

        Animal polyAnimal = new Dog();
        polyAnimal.makeSound();   
    }
}
