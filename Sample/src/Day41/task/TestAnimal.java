package Day41.task;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",3);

        Cat cat = new Cat("kedi",4,"mioaw");
        System.out.println(cat.toString());

        Dog dog = new Dog("dog",6,"hav");
        System.out.println(dog.toString());

    }
}
