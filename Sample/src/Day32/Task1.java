package Day32;
public class Task1 {
    // Write a program with a method named getTotal
    // that accepts two integers as an argument and print its sum.
    public static void main(String[] args) {
        getTotal(1,1);
        getTotal(1,2);
        getTotal(1,3);
        getTotal(1,4);
        getTotal(1,5);
        int a = 1;
        getTotal(a,5);
    }
    public static void getTotal(int a, int b) {
        System.out.println(a+b);
    }
}
