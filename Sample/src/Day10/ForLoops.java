package Day10;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

//        for (int y = 1; y<=1; y = y + 2) {
//            System.out.println(y);
//        }
//        for (int y = 2; y<=11; y = y + 2) {
//            System.out.println(y);
//        }
//    }

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number : ");
        int n = scan.nextInt();
        //int total = 0;
        for ( int i = 1; i<=10; i = i+1){
            //   total = total+n;
            System.out.println(n*i);}
        //   System.out.println( "total is :" + total);
//
//
//        System.out.println("------");
//
//        Random rnd = new Random();
//        for (int i = 0; i<3; i++){
//            int num = rnd.nextInt(30);
//            int total2 = 0;
//            total2 = total2 + num;
//
//            System.out.println("num is here " + num);
//        }
//        System.out.println("=========");
//
//        for( int i2 = 1; i2>0; i2++){
//            System.out.println(i2);
//            //infinite
//        }
//
//        for( byte i2 = 1; i2>0; i2++){
//            System.out.println(i2);
//            //infinite
//        }
//
//
//        for( short i2 = 1; i2>0; i2++){
//            System.out.println(i2);
//            //infinite
//        }
//        System.out.println("==========");
//
//        int j = 1;
//        while (j<10){
//            int num = j*5;
//            System.out.println(num);
//            j++;
//        }

    }
}
