package Day3;

public class IntegerExample {
    public static void main(String[] args) {
        int a = 15;
        int b = 143;
        int c = 12;
        int d = 11;
        int e = 13;

        // int result = (a + b + c + d + e) / 5;
        int result = a + b + c + d + e;
        System.out.println("Sum: " + result);

        double average = result / 5.0;
        System.out.println("Average: " + average);
        // 1. write a program that sums 5 variables,
        // ex: a = 10, b = 20, c = 30, d = 40, e = 50;
        //     a + b + c + d + e = ???;

        // 2. write a program that gets average of 5 variables,
        // ex: a = 10, b = 20, c = 30, d = 40, e = 50;
        //     (a + b + c + d + e)/5  = ???;
    }
}
