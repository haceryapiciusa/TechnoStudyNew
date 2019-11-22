package Day13;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }


    }

}
