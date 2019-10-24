package Day11;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Provide a number:" );
        int max = num.nextInt();
        int sum1 = 0;
        int avarege = 0;
        for(int n = 0; n<=max; n++){
            System.out.println(n);
            sum1 = sum1+n;
            avarege++;
        }
        System.out.println( "sum is;" + sum1);
        System.out.println((double ) sum1/avarege);
    }
}
