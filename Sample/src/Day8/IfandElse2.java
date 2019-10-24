package Day8;

public class IfandElse2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        if (s1.length() <= 5) {
            System.out.println("pasword is not strong");
        } else if (s1.contains("o")) {
            System.out.println("it has o");
        } else if (s1.contains("l")) {
            System.out.println("ignore this");
        } else
            System.out.println("end");

        int number = 3;

        if (number > 5) {
            System.out.println("Number is bigger than 5");
        } else if (number > 3) {
            System.out.println("Number is bigger than 3");
        } else {
            System.out.println("Number is less than 3");


        }

    }
}
