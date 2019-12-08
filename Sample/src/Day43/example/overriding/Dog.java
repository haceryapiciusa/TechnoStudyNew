package Day43.example.overriding;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog says woof");
    }
    public void run() {
        System.out.println("Dog runs");
    }
}
