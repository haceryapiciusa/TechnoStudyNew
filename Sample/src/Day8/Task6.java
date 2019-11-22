package Day8;

public class Task6 {
    public static void main(String[] args) {
        //Task 1: Write a program that sums two strings length
        //ex: "ABC", "Z" => 3+1 =>
        //output: "Length is 4"
        String a1 = "ABC";
        String a2 = "Z";
        // 1. way
        System.out.println("Length is " + (a1+a2).length());
        // 2. way
        System.out.println("Length is " + (a1.length()+a2.length()));
        // 3. way
        int lengthA1 = a1.length();
        int lengthA2 = a2.length();
        int sum = lengthA1 + lengthA2;
        System.out.println("Length is " + sum);

        //Task 2: Write a program that check if
        // the subtraction of s1's and s2's length()
        // is less than 0,
        // if it is less print "can not proceed",
        // else "we can do it"
        // ex1: s1="LongStringHere", s2="ShortOne"
        //       =>  "we can do it"
        // ex2: s1="short", s2="loooooooong"
        //       =>  "can not proceed"
        String c1 = "short";
        String c2 = "loooooooong";

        int lengthC1 = c1.length();
        int lengthC2 = c2.length();
        int subtraction = lengthC1 - lengthC2;

        // for example assuming subtraction=4
        if(subtraction < 0){ //4 < 0
            System.out.println("can not proceed");
        }else { // 4 >= 0
            System.out.println("we can do it");
        }
    }
}
