package Day9;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
          /* String day = "Sunday";
        switch (day) {
            case "Monday":
                System.out.println("Let's Work");
                break;
            case "Saturday":
                System.out.println("waiting for Sunday");
                break;
            case "Sunday":
                System.out.println("Today is fun day");

        }*/
       /* {
            int x = 10;
            final int y = 20;
            switch (x) {
                case 10:
                    System.out.println("HELLO");
                    break;
                case y:
                    System.out.println("TECHNO");
                    break;
            }

        }*/
        /*int x = 10;
        switch (x + 1 + 1) {
            case 10:
                System.out.println("HELLO");
                break;
            case 12:
                System.out.println("TECHNO");
                break;
        }*/

        Scanner grade = new Scanner(System.in);
        System.out.println("What is your Quiz Score");
        int quizScore = grade.nextInt();
        System.out.println("What is you Mid-term Score");
        int midtermScore = grade.nextInt();
        System.out.println("What is you Final Score");
        int finalScore = grade.nextInt();

        System.out.println("The average is");
        int average = ((quizScore + midtermScore + finalScore) / 3);
        System.out.println(average);


        if (average >= 90) {
            System.out.println("your grade is A");
        } else if (average >= 70 && average < 90) {
            System.out.println("your grade is B");
        } else if (average >= 50 && average < 70) {
            System.out.println("your grade is C");
        } else if (average < 50) {
            System.out.println("your grade is F");
        }
    }
}
