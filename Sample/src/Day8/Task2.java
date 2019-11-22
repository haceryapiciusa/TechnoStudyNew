package Day8;

public class Task2 {
    public static void main(String[] args) {
        //        System.out.println("TASK 1---------------------------");
//        //Task 1: write code that count length of string and prints sum of length and index of "e"
//        //    ex: "techno" => 6+1 => 7
//        //    hint: length(), indexOf()
//        //01234567
        String str = "techenoe";
        int length = str.length(); // 8
        int index = str.lastIndexOf("ecqweeqweqwe"); // -1

        int sum = length + index; // 8 + (-1)
        System.out.println(sum); // 7
    }
}
