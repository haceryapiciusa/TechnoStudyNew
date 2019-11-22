package Day8;

public class Task5 {
    public static void main(String[] args) {
        //        //TODO Task 1: write a program that
//        //  take strings and give us sum result:
//        //  ex: s1="100", s2="300" => 400
        String a1 = "100";
        String a2 = "300";

        int num1 = Integer.valueOf(a1);
        int num2 = Integer.valueOf(a2);
        System.out.println(num1+num2);

        //        System.out.println("---------------------------------------");
//        //TODO Task 2: write a program that
//        // take this values and prints the average
//        // values = ["5", 50, 2.24, "22", 50000];
        String v1 = "5";
        int v2 = 50;
        double v3 = 2.24;
        String v4 = "22";
        int v5 = 50000;

        double average = (Integer.valueOf(v1) + v2 + v3 + Integer.valueOf(v4) + v5) / 5;
        System.out.println(average);
//
//        // to convert string to double
        String v6 = "160.95";
        double price = Double.valueOf(v6);
        double quantity = 30;

        boolean checkingPrice = price * quantity == 321.9;
    }
}
