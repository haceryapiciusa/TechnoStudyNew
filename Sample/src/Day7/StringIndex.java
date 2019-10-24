package Day7;

public class StringIndex {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.indexOf("H"));
        System.out.println("----------------");
        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);
        System.out.println("----------------");
        String s3 = "so something so many";
        int indexS3 = s3.lastIndexOf("so");
        System.out.println(indexS3);
        System.out.println("TASK !-----------------");
        String s4 = "techno study";
        int lenght = s4.length();
        int indexs4 = s4.lastIndexOf("e");
        int sum = lenght + indexs4;
        System.out.println(sum);
        System.out.println(lenght);
        System.out.println(indexs4);
        System.out.println("12 + 1:"+(lenght + indexs4));
        System.out.println("-------------------");
        System.out.println("12 + 1:"+(lenght + indexs4));
    }
}
