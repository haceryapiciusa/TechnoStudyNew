package Day32;

public class MyPets {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();

        Animal tiger = new Animal();
        tiger.legs = 4;
        tiger.age = 5;
        tiger.weight = 200.10;
        tiger.name = "Richard Parker";
        tiger.poisonous = false;
        tiger.breed = "Bangal";
        tiger.cuteness();
        int speed = tiger.getSpeed();
        System.out.println("Speed of tiger: " + speed);
        System.out.println("Can my tiger jump?: " + tiger.canJump());

        String output = tiger.toString();

        System.out.println("----------------------------------");
        System.out.println(output);



    }

}
