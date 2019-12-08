package Day43.task;

import Day43.example.overriding.Animal;
import Day43.example.overriding.Cat;
import Day43.example.overriding.Dog;
import Day43.example.overriding.Fox;

public class task2 {
    //add specific methods for Dog, Cat and Fox
    // call those methods via Animal reference
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Fox();

        System.out.println("-----------------------");
        Animal cat = new Cat();
        ((Cat) cat).sleep();

        Animal dog = new Dog();
        ((Dog) dog).run();

        Animal fox = new Fox();
        ((Fox) fox).hunt();
    }
}
