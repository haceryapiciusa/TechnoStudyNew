package Day43.example.overriding;

public class Fox extends Animal {
    @Override
    public void sound() {
        System.out.println("Fox says nothing");
    }
    public void hunt() {
        System.out.println("Fox hunts");
    }

}
