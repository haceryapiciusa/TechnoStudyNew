package Day47.task.task2;

class Spaceship implements Vehicle, AirVehicle {


    @Override
    public void fly() {
        System.out.println("in space");
    }

    @Override
    public int speed() {
        return 0;
    }
}
