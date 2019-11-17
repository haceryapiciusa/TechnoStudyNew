package Day32;

public class JavaClass {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.age = 5;
        tiger.breed = "Bengal";
        tiger.legs = 4;
        tiger.name = "Richard Parker";
        tiger.weight = 200.10;
        tiger.poisonous = false;
        tiger.cuteness();
        int speed = tiger.getSpeed();
        System.out.println(speed);
        System.out.println();

    }
}
