package Day44.task;

public abstract class BaseClass {
    //you have to create Derived class that inherits from BaseClass
    //your BaseClass has to have abstract void method
    //Your DerivedClass has to have method called study()
    //when you run the Main method, you have run the study method.

    abstract void study();
}
class Derived extends BaseClass {
    @Override
    public void study() {
        System.out.println("Derived study() called"); }
}
class Main {
    public static void main(String args[]) {

        BaseClass b = new Derived();
        b.study();

    }

}