package Day43.task;

import Day43.example.overriding.Animal;
import Day43.example.overriding.Cat;
import Day43.example.overriding.Dog;
import Day43.example.overriding.Fox;

public class task {
    //create class Dog
    //create class Fox
    //override method sound
    // and print every animals sound
    public static void main(String[] args) {
        Animal a =new Animal();
        a.sound();
        Cat cat = new Cat();
        cat.sound();
        Animal animal = new Cat();
        animal.sound();
        Animal dog = new Dog();
        dog.sound();
        Animal fox = new Fox();
        fox.sound();
    }
}
