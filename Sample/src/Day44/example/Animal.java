package Day44.example;
//The abstract keyword is a non-access modifier, used for classes and methods
class TestAbstractConcept {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}

public abstract class Animal {
   // Abstract method: can only be used in an abstract class,
   // and it does not have a body.
   // The body is provided by the subclass (inherited from).
    public abstract void makeSound();

    //and can have regular methods
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark bark...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow..");
    }
}
