package Day12;

public class LoopContinueTask1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            //TODO if number is even continue
            //     else print that number
            //write you code here
            if(i%2==0)
                continue;
            else
                System.out.println("Iteration " + i);
        }
    }
}
