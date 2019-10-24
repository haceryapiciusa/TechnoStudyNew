package Day11;

import java.util.Scanner;

public class WhileTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write a text: ");
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            }
            // part1. check for the @,$,* symbols also for a strong password

            if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("*")) {
                System.out.println("Strong Password");
            } else {
                System.out.println("Weak Password");
            }
            // if (!line.contains("#")||line.contains("@")||line.contains("$")||line.contains("*")){
            //    System.out.println("Week Password");
            //  }
//            if (line == line.toUpperCase()){
//                System.out.println("use lowercase letters");
//            }
//            if (line != line.toUpperCase()){
//                System.out.println("use uppercase letters");
//            }

            if (line.equals(line.toUpperCase())) {
                System.out.println("use lowercase letters");
            }
            if (line.equals(line.toLowerCase())) {
                System.out.println("use uppercase letters");
            }
        }
    }
}
