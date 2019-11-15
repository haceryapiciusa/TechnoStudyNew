package Day24_ClassesAndAttributes;
public class MyClass {

    int x = 5;
    int y;
    int z = 45;
    final int a = 23;

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass();  // Object 1
        MyClass myObj2 = new MyClass();  // Object 2

        myObj2.x = 25;//here I changed object 2 to 25

        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25

        System.out.println(myObj1.x);  // Outputs 5

        MyClass obj = new MyClass();


        obj.y = 42;
        obj.z = 2;
//        obj.a = 45; // will generate an error: cannot assign a value to a final variable

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.a);
    }

}

