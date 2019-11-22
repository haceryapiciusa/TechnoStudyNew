package Day10;
//Task 2
// continue task 1 but also check for B+, B-, C+, C-, D+, D-
// ex:
// B+ or B or B- => Good
// C+ or C or C- => middle
// D+ or D or D- => pass
// TODO Hint: in java logical operator for OR is || , two vertical lines

import java.util.Scanner;

public class IfElse7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a grade: [A, B, C, D, F]");
        String grade = scan.nextLine();

        if (grade.equals("A")) {
            System.out.println("excellent");
        } else if ("B-".equals(grade) || "B".equals(grade) || "B+".equals(grade)) {
            System.out.println("good");
        } else if (grade.equalsIgnoreCase("C") || grade.equals("C-") || grade.equals("C+")) {
            System.out.println("middle");
        } else if (grade.equals("D") || grade.equals("D-") || grade.equals("D+")) {
            System.out.println("pass");
        } else if (grade.equals("F")) {
            System.out.println("fail");
        } else {
            System.out.println("invalid grade");
        }
    }
}
