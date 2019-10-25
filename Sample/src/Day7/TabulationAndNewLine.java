package Day7;

public class TabulationAndNewLine {
    public static void main(String[] args) {


//        String s1 = "Bob";
//        String s2 = "Hello ";
//        String s3 = "!";
//        System.out.println(s2+s1+s3);

    String s1 = "hello1";
    String s2 = "hello1";
    String s3 = "hello1";

    if(s1 == s2){
        System.out.println("its equal");
    }
    String s4 = new String("ABC");
    String s5 = new String("ABC");
       if( s4 == s5){
        System.out.println("its equal2");
    }
       if(s4.equals(s5)){
        System.out.println("its equal3");
    }


        System.out.println("symbol \\");
        System.out.println("    tabulations");
        System.out.println("\ttabulations");
        System.out.println("Name: Ali");
        System.out.println("Name:\nAli");
        System.out.println("Name:\n\t\tAli");

        System.out.println("Surname:\tYapici");
        System.out.println("Surname: \n Yapici");




}}
