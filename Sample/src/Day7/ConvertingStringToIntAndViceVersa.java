package Day7;

public class ConvertingStringToIntAndViceVersa {
    public static void main(String[] args) {
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.println(s1);
        System.out.println(s1+10);
        System.out.println(number+10);
        System.out.println("-----------");
        String s2 = "30";
        int n2 = Integer.valueOf(s2);
        System.out.println(s2+10);
        System.out.println(n2+10);
        System.out.println("----------");
        String sum1 = "100";
        String sum2 = "300";
        int sum3 = Integer.valueOf(sum1)+Integer.valueOf(sum2);
        System.out.println(sum3);
        System.out.println("------------");
        String v1 = "5";
        int v2 = 50;
        double v3 = 2.24;
        String v4 = "22";
        int v5 = 50000;

        String v6 = "22.234234";
        Double.valueOf(v6);

        double average = (Integer.valueOf(v1) + v2 + v3 + Integer.valueOf(v4) + v5) / 5;
        System.out.println(average);



    }
}
