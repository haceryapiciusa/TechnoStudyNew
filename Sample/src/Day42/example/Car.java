package Day42.example;

public class Car {
    private  String name;
    private String model;
    private int serialNumber;
    private boolean fast;
    private boolean slow;
    private boolean sunroof;

    public Car(String name){
        this.name = name;
    }
//    public String getName(){
//        return name;
//    }
//   public String getModel(){
//        return model;
//    }
    public void setName(String n){
        name = n;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    public String getName(){
        return name;
    }
    public boolean isFast(){
        return fast;
    }

    public String toString(){
        return name;
    }
}
