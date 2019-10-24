package Day8;

import java.util.Scanner;

public class IfandElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide temperature: ");
        int tmprt = scan.nextInt();
        if(tmprt>=70){
            System.out.println("hot");
        }
        else if (tmprt<70&& tmprt>=50){
            System.out.println("warm");
        }
        else if (tmprt<50&& tmprt>=20){
            System.out.println("cold");
        }else System.out.println("freezing");
    }
}
