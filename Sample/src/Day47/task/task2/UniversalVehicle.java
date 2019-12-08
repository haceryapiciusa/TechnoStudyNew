package Day47.task.task2;

public class UniversalVehicle
        implements AirVehicle, SeaVehicle {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public int speed() {
        return 0;
    }
}