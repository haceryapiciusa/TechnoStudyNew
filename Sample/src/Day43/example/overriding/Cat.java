package Day43.example.overriding;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat says meow");
    }
    public void sleep() {
        System.out.println("Cat sleeps");
    }
    public void jump() {
        System.out.println("Cat jumps");
    }
}
