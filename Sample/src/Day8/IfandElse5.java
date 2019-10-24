package Day8;

import java.util.Scanner;

public class IfandElse5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide a number : ");
        int n = scan.nextByte();
        if (n <=128 && n >= -127){
            System.out.println("its byte");
        }else if (n<= Integer.MAX_VALUE && n>=Integer.MIN_VALUE){
            System.out.println("its int");
        }else if (n<= Long.MAX_VALUE && n >=Long.MIN_VALUE){
            System.out.println("its long");
        }


        /*System.out.println("Write a number please:");
        long number = scan.nextLong();
        if (number >= -128 && number <= 127) {
            System.out.println("DataType is byte");
        } else if (number >= -32768 && number <= 32767) {
            System.out.println("DataType is short");
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println("DataType is int");
        } else if (number >= -9223372036854775808L && number <= Long.MAX_VALUE) {
            System.out.println("DataType is long");
        }*/
    }
}
