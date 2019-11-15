package Day24_JavaClassAttributes;

public class MyClass {
    int x = 5;
    int y = 6;
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.y = 42;

        System.out.println(obj.x);
        System.out.println(obj.y);
    }

}
