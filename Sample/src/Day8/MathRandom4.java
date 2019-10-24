package Day8;

public class MathRandom4 {
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        System.out.println(randomInRange);
        System.out.println("-------------");

        if(randomInRange <= 0){
            System.out.println("its negative");
        }
        if (randomInRange>=0){
            System.out.println("its positive");
        }
        System.out.println("------------");

        if((randomInRange % 2) == 0){
            System.out.println("its even");
        }
        else {
            System.out.println("its odd");
        }
        System.out.println("---------");

        int a = (int) (Math.random() * 10); // gets integer form double
        int b = (int) (Math.random() * 100); // gets integer form double
        System.out.println(a);
        System.out.println(b);

        System.out.println(a+b);


    }
}
