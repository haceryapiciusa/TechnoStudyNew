package Day15;

public class ArrayTask6 {
    // you have string array of numbers,
    // change data type to int, using loop
    // the array size should be minimum 15
    //ex: {"11", "13", "17"} =>  {11, 13, 17}
    public static void main(String[] args) {
        String[] strArray = new String[15];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "z" + i;
            // stringNumbers[0] = "0"
            // stringNumbers[1] = "1"
            // ...
            // stringNumbers[14] = "14"
        }
        String stringSum = "";
        for (String a : strArray) {
            stringSum += a;
        }
        System.out.println("StringConcatenate: " + stringSum);

        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }

        int intSum = 0;
        for (int n : intArray) {
            intSum += n;
        }
        System.out.println("IntSum: " + intSum);


    }
}
