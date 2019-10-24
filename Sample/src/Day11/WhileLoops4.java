package Day11;

import java.util.Scanner;

public class WhileLoops4 {
    public static void main(String[] args) {
        //        int i = 0;
//        while (true){
//            i++;
//            System.out.println(i);
//            if (i==5){
//                break;
//            }
//        }
//        System.out.println("end");
//    }
        Scanner s = new Scanner(System.in);

        System.out.println("begin");
        while (true){
            System.out.println("Write text: ");
            String str = s.nextLine();

            if(str.equals("quit")){
                break;
            }
            if (str.length()>=10){
                System.out.println("String is too large");
            }
        }

        System.out.println("end");
    }
}
