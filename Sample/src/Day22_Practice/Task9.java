package Day22_Practice;

//write a java program that iterates an array using while-loop
public class Task9 {
    public static void main(String[] args) {
        int [] array = {1,23,34,45,34,645,6,45};

        int i = 0;

            while (i < array.length) {

                System.out.println(array[i]+ " ");
                i++;
            }
        }
}
