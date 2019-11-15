package Day23_Practice;

//    Write a Java program to find the largest element in an array.
// {1,34,66,1000,23,4,7,9} => 1000
public class Task3 {
    public static void main(String[] args) {
        int[] intArray = {1,34,66,1000,23,4,7,9};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]>=max){
                max=intArray[i];
            }
        }System.out.println(max);


        //Arrays.sort(intArray);
        //int max= a[a.length-1];
        //System.out.println(max)


    }
}
