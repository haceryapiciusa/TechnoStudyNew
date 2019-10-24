package Day8;

import java.util.Scanner;

public class IfElse6Equals {
    public static void main(String[] args) {
        /* Scanner s = new Scanner(System.in);
        System.out.println("Provide a grade: ");
        String a = s.nextLine();
        if (a.equals("A")) {
            System.out.println("Excellent");
        } else if (a.equals("B")) {
            System.out.println("Good");
        } else if (a.equals("C")) {
            System.out.println("Middle");
        } else if (a.equals("D")) {
            System.out.println("Pass");
        } else if (a.equals("F")) {
            System.out.println("Fail");
        }*/

        // Task Evaluate result of exam
        // A => excellent
        // B => good
        // C => middle
        // D => pass
        // F => fail
        // TODO Hint: nextLine, String, equals, equalsIgnoreCase

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a grade:  [A, B, C, D, F] ");
        String grade = scan.nextLine();

        if ((grade.equals("A"))||(grade.equals("A+")) || (grade.equals("A-"))) {
            System.out.println("excellent");
        } else if (("B".equals(grade))|| "B+".equals(grade)|| "B-".equals(grade)) {
            System.out.println("good");
        } else if (("C".equals(grade))|| "C+".equals(grade) ||"C-".equals(grade) ){
            System.out.println("middle"); }
        else if (("D".equals(grade))|| "D+".equals(grade)||"D-".equals(grade)){
            System.out.println("pass");
        } else System.out.println("invalid");
    }

    }

