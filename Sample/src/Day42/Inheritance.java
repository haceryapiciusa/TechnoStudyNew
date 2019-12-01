package Day42;

import Day42.example.inheritance.House;
import Day42.example.inheritance.SingleHouse;
import Day42.example.inheritance.Warehouse;

public class Inheritance {
    public static void main(String[] args) {
        SingleHouse sh = new SingleHouse();
        SingleHouse sh2 = new SingleHouse();

        Warehouse wh = new Warehouse(1, 1000.10);

        House house1 = new SingleHouse();
        House house2 = new Warehouse(0,0);
    }

}
