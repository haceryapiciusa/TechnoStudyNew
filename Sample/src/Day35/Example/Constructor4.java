package Day35.Example;

public class Constructor4 {

    private Constructor4(int data){
        System.out.println("Constructor called");
    }
    public void myMethod(){
        System.out.println("Method called");
    }
    //this is a method that returns a class c4.
    //and this class has a constructor that pass parameter value;

    Constructor4 create (int value){    //eger static yaparsak asagidaki new u kaldirmamiz lazim
        Constructor4 c4 = new Constructor4(value);
        return c4;
    }

    public static void main(String[] args) {
        Constructor4 myClass = new Constructor4(5);
        //Constructor4 myClass = Constructor4.create(42); static olursa yukarisi bu sekilde kullan

        myClass.myMethod();

    }
}

