package Day23_Practice;

//    Write a Java program to find the smallest element in an array.
// {1,34,66,1000,23,4,7,9} => 1000
public class Task4 {
    public static void main(String[] args) {
          int[] intArray = {1,34,66,1000,23,4,7,9};
          int min =Integer.MAX_VALUE;
          for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]<=min){
                min=intArray[i];

            }
          }System.out.println(min);



    }
}
