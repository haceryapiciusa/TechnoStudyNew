package Day21;

public class Vehicle {
    int doors;
    int speed;
    String model;
    String color;

    void run() {
        System.out.println("I am running");
    }

   private void run(int doors, int speed, String color) {
        System.out.println("I am running");
    }

}
