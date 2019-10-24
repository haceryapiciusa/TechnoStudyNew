package Day1;

public class IfAndElse {
    public static void main(String[] args) {
        int num1 = 43;
        int num2 = 67;
        TestCompharingOperators(num1, num2);
    }
    static void TestCompharingOperators( Integer num1, Integer num2) {
         /*if (num1 == num2)
             System.out.println("numbers are equal");
         else
             System.out.println("numbers are not equal");
             System.out.println("numbers are not equal");*/
        if (num1 == num2)
            System.out.println("numbers are equal");
        else
            System.out.println("numbers are not equal");

        int a = 12 * 34;
        int b = 45 * 28;
        if (a > b)
            System.out.println("a is greater");
        else ;
        System.out.println("b is greater");


        int numA = 12 * 34;
        int numB = 45 * 28;
        int numC = 32 * 24;
        if (numA > numB) {
            System.out.println("a is bigger than b");
        } else if ( numB > numC) {
            System.out.println("b is bigger than c ");
        } else if( numC > numA) {
            System.out.println("c is bigger than a");
        } else if ( numA > numC) {
            System.out.println("a is bigger than c");
        } else if ( numB > numA){
            System.out.println("b is bigger than a");

        }



    }

}

