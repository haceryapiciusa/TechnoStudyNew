package Day12;

import java.util.Random;

public class LoopBreak {
    // part1, run loop up to 100000000,
    // and exit that loop when i is equal to 232558

    // part2, continue part1, but instead of 232558 use some random number
    // using random generator, Math.random, Random

    public static void main(String[] args) {
        // int number = 0;
        //first part
//        for (int i = 0; i <= 100000000; i++) {
//            System.out.println(i);
//            if (i == 232558) {
//                System.out.println("----------------");
//                number = i;
//                break;
//            }
//        }
//        System.out.println("Your number is " + number);
//    }

        //second part

        Random rand = new Random();
        int n = rand.nextInt(1000000);
        for (int i = 1; i <= 1000000; i++) {

            if (i == Math.random()) {
                i = n;
                break;
            }
        }
        System.out.println("Your number is " + n);
    }
}
