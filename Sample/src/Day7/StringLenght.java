package Day7;

public class StringLenght {
    public static void main(String[] args) {
        String s1 = "ABCDE";
        System.out.println(s1.length());

        int length = s1.length();
        System.out.println(length);

        String username = "techno.study";
        if( username.length()<10) {
            System.out.println("you can login");
        }
        if(username.length()>=10){
            System.out.println("you cannot login");
        }
//1.task
        String a = "ABC";
        String b = "Z";
        int lenght1 = 4;
        System.out.println("Lenght is "+(a+b).length());

//2.task
        String s2 = "short" ;
        String s3 = "looooooong";
        int lenght2 = s2.length();
        int lenght3 = s3.length();
        int subs = lenght2 - lenght3;

        if( subs<0){
            System.out.println("can not proceed");
        }
        else System.out.println("we can do it");

    }
}
