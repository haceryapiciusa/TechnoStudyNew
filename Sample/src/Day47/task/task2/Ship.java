package Day47.task.task2;

public class Ship implements Vehicle, SeaVehicle  {
    @Override
    public int speed() {
        return 80;
    }

    @Override
    public void swim() {
        System.out.println("swims");
    }
}
