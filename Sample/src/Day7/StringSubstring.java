package Day7;

public class StringSubstring {
    public static void main(String[] args) {
        String string1 = "Hello World";
        System.out.println(string1.substring(6));
        System.out.println(string1.substring(6,7));
        System.out.println(string1.substring(0,1));
        System.out.println("--------");
        System.out.println(string1.substring(11,11));
        System.out.println(string1.substring(0,4));
        System.out.println("------------");
        //Task 1:
        // write a program that prints your initials
        String a = "Hacer";
        String b = "Yapici";
        System.out.println(a.substring(0,1)+b.substring(0,1));
        System.out.println(a.substring(0,1)+"." +b.substring(0,1)+".");
        System.out.println("-------------");
        //Task 2: continue "task 1" but print this:
        // ex: Michale Jackson => M.J.
        String dot = ".";
        System.out.println(a+dot+b+dot);

        String s1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(s1.substring(10,25));
    }
}
