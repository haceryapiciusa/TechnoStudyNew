package Day11;

public class ForEx2 {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for(int i = 1; i <=10; i=i+3){
            System.out.println(i);
            sum+=i; // sum=sum+i
            counter=counter+1;//counter ++
        }
        System.out.println("sum from 1 to 1000 with +3 is :" + sum);
        System.out.println("counter is : " +counter);
        System.out.println((double)sum/counter);
    }
}
