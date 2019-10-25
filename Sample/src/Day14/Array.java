package Day14;

public class Array {
    public static void main(String[] args) {
//        int[] xyz = {2, 11, 45, 9, 56};
//
//        //i starts with 0 as array index starts with 0 too
//
//        //the task is to find and print out the maximum element
//        int max = 0;
//        for (int i = 0; i < xyz.length; i++) {
//            System.out.println(xyz[i]);
//            int value = xyz[i];
//            if(xyz[i]> max)
//                max = xyz[i];
//
//        }
//        System.out.println(max);

        int[] myArray = {11, 2, 45, 9, 56};
        // 0   1   2   3  4
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < min) {
                min = myArray[i];
                System.out.println(min);
            }
        }
    }
}
