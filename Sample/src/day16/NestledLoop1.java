package day16;

public class NestledLoop1 {
    public static void main(String[] args) {
        for(int i = 1; i <10; i++) {
            System.out.println(i + "x" + i + "=" + i);
        }
            System.out.println("----");

        int a = 2;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " x " + b + " = " + (a * b));
        }
        System.out.println("======");


        for(int i = 1; i <10; i++) {
            for (int j=1;j<10; j++)
            System.out.println(i + "x" + j + "=" +(i*j));
        }
        System.out.println("----");


    }
}
