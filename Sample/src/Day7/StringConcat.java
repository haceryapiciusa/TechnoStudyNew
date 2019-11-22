package Day7;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World !!!";
        String a3 = "YES!!!";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s2).concat(a3));

        String s3 = "What ";
        String s4 = "is ";
        String s5 = "your ";
        String s6 = "name";
        String s7 = "?";

        System.out.println(s3+s4+s5+s6+s7);

        System.out.println("what\nis\nyour\nname\n?");
        System.out.println("A\nB\nC\nD\nE\nF");
    }
}
