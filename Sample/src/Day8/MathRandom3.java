package Day8;

public class MathRandom3 {
    public static void main(String[] args) {
        /*int min = 10;
        int max = 45;
        int range = max - min;
        int randomInRange = min + (int)(Math.random() * (range + 1));
        System.out.println(randomInRange);   */


        /*int temperature = randomInRange;
        System.out.println("Tempature is :"+ temperature);
        if (temperature == 40) {
            System.out.println("Frying");
        }
        if (temperature >= 27) {
            System.out.println("Its hot");
        }
        if (temperature >= 20 && temperature <= 27) {
            System.out.println("Its warm");
        }
        if (temperature < 20 && temperature >= 10) {
            System.out.println("Cool");
        }
        if (temperature < 10) {
            System.out.println("Freezing");
        }*/

        int min1 = 0;
        int max1 = 3;
        int range1 = max1 - min1;
        int randomInRange1 = min1 + (int)(Math.random() * (range1 + 1));
        System.out.println(randomInRange1);


        if(randomInRange1 == 1){
            System.out.println("One");
        }
        if(randomInRange1 == 0){
            System.out.println("zero");
        }
        if(randomInRange1 == 3){
            System.out.println("three");
        }
        if(randomInRange1 == 2){
            System.out.println("two");
        }





    }
}
