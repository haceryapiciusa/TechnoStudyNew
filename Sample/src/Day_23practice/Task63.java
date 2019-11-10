package Day_23practice;

public class Task63 {
    // Given an array of ints,
    // print "true" outside of loop, if it does not contains 4
    // {4, 1, 1} => false
    // {1, 2, 3} => true
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state
    public static void main(String[] args) {
        int[] intArray = {1, 34, 66, 1000, 23, 7, 9};
        boolean havefour = false;
        for (int i : intArray) {
            if(i == 4){
                havefour = true;
            }
        }
        if(havefour){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
