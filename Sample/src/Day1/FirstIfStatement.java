package Day1;

public class FirstIfStatement {
    public static void main(String[] args) {
        int temperature = 50;
        if(temperature >= 70){
            System.out.println("its hot");
        }
        if(temperature < 70 && temperature >= 60){
            System.out.println("its warm");
        }
        if(temperature < 60 && temperature >= 20){
            System.out.println("cool");
        }
        if(temperature < 20){
            System.out.println("freezing");
        }




        int whether = -1;
        if(whether >0){
            System.out.println("positive");
        }
        if(whether < 0){
            System.out.println("negative");
        }
        if(whether == 0){
            System.out.println("not positive neither negative");
        }



        int number = 6;

        if(number % 2 == 0){
            System.out.println("its an even number");
        }
        if(number % 2 != 0){
            System.out.println("its an odd number");
        }

    }

}

