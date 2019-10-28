package day16;

public class Nestledtask2 {
    // Write program that prints this using loops
    //    *
    //    **
    //    ***
    //    ****
    //    *****

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("=====");
//
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j >= i) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();


//        for (int i = 0; i <= 5; i++) {
//            for (int j = 5; j >= 0; j--) {
//                if (j <= i) {
//                    System.out.print("*");
//                } else {
//                    System.out.println("#");
//                }
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
//            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("MultiDimrnsionalArrays");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
