package Day7;

public class StringReplace {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1.replace("o","@"));
        System.out.println("-----------");
        String s2 = "one two one three";
        System.out.println(s2.replace("one","four"));
        System.out.println("--------------");
        String s3 = "name;surname;age;grade;class";
        System.out.println(s3.replace(";"," "));
        System.out.println("---------");

        String name = "Hacer";
        String name2 = name.replace("Hacer","Yapici");
        System.out.println(name2.replace("Hacer","Yapici"));
        System.out.println(name);
    }
}
