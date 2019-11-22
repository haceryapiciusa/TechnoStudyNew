package Day2;

public class CharExampl {
    public static void main(String[] args) {
        System.out.print("T");
        System.out.print("E");
        System.out.print("C");
        System.out.print("H");
        System.out.print("N");
        System.out.print("O");
        System.out.print(" S");
        System.out.print("T");
        System.out.print("U");
        System.out.print("D");
        System.out.println("Y");

        byte smallest = 113;
        long longerint = 2147483647;
        int maxInt = 2147483647;
        short shortInt = 287;

        float decimal = 23.341231233333333333333333333333f;
        double largerDecimal = 234.2141312647859975367848596969746454546475;
        char character = 7;

        System.out.println(decimal);

        int waterprice = 10;
        int breadprice = 6;
        int sum = waterprice + breadprice;

        System.out.println(sum);
        System.out.println("Total sum 1:" + sum);
        System.out.println("Total sum 16:" + sum);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int result = (a + b + c + d + e);
        System.out.println("Sum: " + result);
        double average = result / 5.0;
        System.out.println("Avarage:" + average);


        System.out.println(a + b + c + d + e);
        System.out.println((a + b + c + d + e) / 5);
        System.out.println(result / 5);

        char a1 = 'T';
        char a2 = 'E';
        char a3 = 'C';
        char a4 = 'H';
        char a5 = 'N';
        char a6 = 'O';
        char a12 = ' ';
        char a7 = 'S';
        char a8 = 'T';
        char a9 = 'U';
        char a10 = 'D';
        char a11 = 'Y';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);

        System.out.print(a1);
        System.out.print(a2);
        System.out.print(a3);
        System.out.print(a4);
        System.out.print(a5);
        System.out.print(a6);
        System.out.print(a12);
        System.out.print(a7);
        System.out.print(a8);
        System.out.print(a9);
        System.out.print(a10);
        System.out.println(a11);

        boolean falseBool = false;
        boolean trueBool = true;
        System.out.println(trueBool && trueBool);
        System.out.println(falseBool && trueBool);
        System.out.println(trueBool && falseBool);
        System.out.println(falseBool && falseBool);


        System.out.println("true || true =>" + (trueBool || trueBool));
        System.out.println("false || true =>" + (falseBool || trueBool));
        System.out.println("true || false =>" + (trueBool || falseBool));
        System.out.println("false || false =>" + (falseBool || falseBool));

        System.out.println(true && true || false && false);
        System.out.println(true && (true || false) && (false || true) && true || false);


        int temperature = 40;
        if (temperature >= 70) {
            System.out.println("its hot");
        }
        if (temperature < 70 && temperature >= 60) {
            System.out.println("its warm");
        }
        if (temperature < 60 && temperature >= 20) {
            System.out.println("cool");
        }
        if (temperature < 20) {
            System.out.println("freezing");
        }


    }
}
