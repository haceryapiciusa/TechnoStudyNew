package Day9;

public class MathRandomTask4 {
    // Write a program that sums 2 random integer numbers,
    //         and print sum.
    public static void main(String[] args) {


        int a = (int) (Math.random() * 123); //0-10 // gets integer form double
        int b = (int) (Math.random() * 333); //0-100 // gets integer form double

        System.out.println(a);
        System.out.println(b);

        System.out.println(a + b);
    }
}
