package Day32;

public class Task5 {
    //Write a boolean method called isOdd() in a class called OddEvenTest,
    // which takes an int as input and returns true if the it is odd.
    public static void main(String[] args) {
        boolean a = isOdd(3);
        System.out.println(a);
    }

    public static boolean isOdd(int a) {
        boolean odd = false;
        if(a%2!=0){
            odd = true;

        }
        return odd;
    }
}
