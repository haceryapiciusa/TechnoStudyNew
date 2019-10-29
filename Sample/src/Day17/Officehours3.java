package Day17;

public class Officehours3 {
    public static void main(String[] args) {
        String[]numArr = {"$50","$40","$30"};
        System.out.println(numArr.length + " length is here ");

        int total = 0;

        for(int i = 0 ; i<numArr.length; i++){

            String num1 = numArr[i];

            num1 = num1.replace("$"," ");

            System.out.println(num1 + " num1 is  here");

            int mynum = Integer.valueOf(num1);

            total += mynum;

        }

        System.out.println(total);


    }
}
