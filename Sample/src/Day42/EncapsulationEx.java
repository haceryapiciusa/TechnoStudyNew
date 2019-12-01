package Day42;

import Day42.example.Car;

public class EncapsulationEx {
    public void carGallery(){
        //Car ford = new Car("ford");
        Car car = new Car("Ford");
        //ford.name;

       // String n = ford.getName();
        car.setName(" Toyota");
        System.out.println(car);

    }
}
