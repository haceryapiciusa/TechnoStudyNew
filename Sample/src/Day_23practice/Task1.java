package Day_23practice;

// write a java program that find maximum
// of two numbers
public class Task1 {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       if (a>b){
           System.out.println("its the max");
       }
       else {
           System.out.println("its min");
       }
       //second way
        int max = Math.max(a,b);
        System.out.println("max number is : "+ max);

        //3. way
        int max2 = (a >= b) ? a : b;
        System.out.println("Max2 is:" + max2);


    }

}
