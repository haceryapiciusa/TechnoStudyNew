package Day11;
//find out max number between two inputs, use user input and ternary operator
//    int val1 = 10;
//    int val2 = 20;
//
//    int max =
//    output
//    20
public class TernaryOperatorTask1 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;

        int max = (val1 >= val2) ? val1 : val2;

        int min = (val1 <= val2) ? val1 : val2;

        System.out.println(max);
        //System.out.println(min);

        int x = -55;
        int abs = x < 0 ? -x : x;

        if (x < 0) {
            abs = -x;
        } else {
            abs = x;
        }

        System.out.println(max);

//find out min number between two inputs, use user input and ternary operator
//    int val1 = 10;
//    int val2 = 20;
//
//    int min =
//    output
//    10

//find out absolute value between two inputs, use user input and ternary operator
//    int val1 = -20;
//
//    int abs =
//    output
//    10

    }
}

