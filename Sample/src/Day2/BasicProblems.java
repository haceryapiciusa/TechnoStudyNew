package Day2;

public class BasicProblems {
    public static void main(String[] args) {
        /*System.out.println("Basic Problems");
        int number = 10;
        if(number > 100);{
            System.out.println("I am here");
        }*/
        /*
        {{{{
            {
                System.out.println("1th empty");
            }
            System.out.println("2nd empty");
        }
            System.out.println("3th empty");
        }
            System.out.println("4th empty");
        }
            System.out.println("5th empty");
        }*/

        /*int num = 10;
        System.out.println(num);
        num = 5;
        System.out.println(num);*/
        /*int n = 5;
        System.out.println(n);
        n=4;
        System.out.println(n);
        n=3;
        System.out.println(n);
        n=2;
        System.out.println(n);
        n=1;
        System.out.println(n);*/
        /*int a =2;
        int b = 1;
        System.out.println(a * b);
        b=2;
        System.out.println(a * b);
        b=3;
        System.out.println(a * b);
        b= b + 1;
        System.out.println(a * b);*/
        /*int numb = 1;
        System.out.println(numb);
        numb = numb + 1;
        System.out.println(numb);
        numb = numb - 1;
        System.out.println(numb);*/
        /*int vari = 2;
        System.out.println(vari);
        vari= vari * 2;
        System.out.println(vari);
        vari= vari + 2;
        System.out.println(vari);*/
        /*
        int a = 9999;
        int b = 9999;
        int result = a * b;
        System.out.println("9999 * 9999 = " + result);
        */
        /*String first = "Hi";
        String second = "bye";*/

        /*String first = "Yo";
        String second = "Alice";


        makeAbba(first, second);
    }
    static void makeAbba(String first, String second){

        System.out.println(first + second + second +first);

        int i1 = 10;
        int i2 = 5;
        int i3 = i1 - i2;
        System.out.println(i3);*/


        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        callAdd(num1, num2, num3);
        callMultiply(num1, num2, num3);
        callDeduct(num1, num2, num3);
        callDivide(num1, num2, num3);
    }
    static void callAdd(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
    static void callMultiply(int num1, int num2, int num3) {
        System.out.println(num3 - num2 - num1);
    }
    static void callDeduct(int num1,int num2, int num3 ) {
        System.out.println(num1 * num2 * num3);
    }
    static void callDivide(int num1, int num2, int num3){
        System.out.println(num3 / (num2 + num1));

        int a = 9;
        a++;
        a +=3;
        a -=10;
        a *=2;
        a /=4;

        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;
        System.out.println(x);
        System.out.println(y);

        char aChar = '2';
        char A = 'A';
        char B = 'A' + 1;
        System.out.println(A);
        System.out.println(B);

        String courseName = "techno study";
        System.out.println(courseName);

        String printA = "letter is: " + A;
        System.out.println(printA);

        char c = courseName.charAt(2);
        String myVar = "tey";

        boolean name = courseName.startsWith("tey");
        boolean dy = courseName.endsWith("dy");

        boolean no = courseName.contains("no");
        System.out.println(name);
        System.out.println(dy);
        System.out.println(no);

    }
}
