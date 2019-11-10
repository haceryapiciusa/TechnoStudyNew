package Day21;

import java.util.Scanner;

public class Homework {
    //    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
    //advanced, put in a new class and call the method from the main method.


    static class WordCount {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the string :");
            String str = in.nextLine();
            System.out.println("number of words in the string:" + wordcount(str));
        }

        public static int wordcount(String sentence) {
            int count = 0;
            char ch[] = new char[sentence.length()];
            for (int i = 0; i < sentence.length(); i++) {

                Character letterChar = sentence.charAt(i);

                ch[i] = sentence.charAt(i);
                System.out.println("count: " +i);
                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                    count++;
            }
            return count;
        }
    }
}
