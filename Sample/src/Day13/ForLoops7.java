package Day13;

public class ForLoops7 {
    public static void main(String[] args) {

//        for (int i = 1, j = 2; i <= 10 && j < 5 ; i++, j++) {
//            // i = 1, j = 2
//            // i = 2, j = 3
//            // i = 3, j = 4
//            // i = 4, j = 5
//            System.out.println(i * j);
//        }


        System.out.println("Example with multiple  declarations,initialiazations and update expressions");

        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.print("i=" + i);
            System.out.print(" j=" + j);
            System.out.print(" k=" + k);

            System.out.println();
        }
    }

    public static void main2(String[] args) {
        int x = 2;
        for (long y = 0, z = 4; x < 10 && y < 10; x++, y++) {
            System.out.println(y + " ");
        }

        System.out.println(x);
    }
}
