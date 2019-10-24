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
        String name = "Hacer";
        String lastname = "Yapici";
        System.out.println(name.substring(0,1)+lastname.substring(0,1));
        System.out.println(name.substring(0,1)+"." +lastname.substring(0,1)+".");
        System.out.println("-------------");
        String s1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(s1.substring(10,25));
    }
}
