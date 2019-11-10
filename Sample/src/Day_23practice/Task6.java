package Day_23practice;

public class Task6 {
    // Given an array of ints,
    // print true if it contains no 1's or it contains no 4's.
    // {1, 2, 3} => true
    // {2, 3, 4} => true
    // {1, 2, 4} => false
    public static void main(String[] args) {
        int[] intArray = { 1,4,34, 66, 1000, 23, 7, 9};
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i : intArray) {
            if (i == 1 )  {
                hasOne = true;
            }
            else if(i == 4 ){
                hasFour = true;
            }
        }
        if(hasOne && hasFour){
            System.out.println(false);
        }else {
            System.out.println(true);
        }

    }
}