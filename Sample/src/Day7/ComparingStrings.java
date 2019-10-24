package Day7;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";
        if(s1==s2) {
            System.out.println("its equal");
        }
        System.out.println("------------");

        String s3 = new String("YES");
        String s4 = new String("YES");
        if(s3.equals(s4)){
            System.out.println("its equal again");
        }
        System.out.println("------------");
        String name = "Max";
        if(name.equals("Ali")){
            System.out.println("Hello");
        }
        System.out.println("------------");
        String name2 = "TS";
        if(name2.equals("TS")) {
            System.out.println("you are gonna be Tester after 6 months");
        }
        System.out.println("-----------");
        String n = "Hacer";
        String l = "Yapici";
        if(n.equals("Hacer")){
            System.out.println(l);
        }
        System.out.println("-----------");




    }
}
