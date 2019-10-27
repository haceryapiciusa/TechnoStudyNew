package Day15;

public class ArrayTask5 {
    public static void main(String[] args) {
//        int[] a = {3,1,7,4,5};
//        int[] b = {3,8,6,0,7};
//
//        if(a[0] == b[0]){
//            System.out.println("They have same first element");
//        }
//        if (a[4]==b[4]){
//            System.out.println("They have same last element");
//        }
//        if (a[2]==b[2]){
//            System.out.println("They have same last element");
//        }
//        else System.out.println("they are not equal");

        int[] a = {10,20,25,60,40,30};
        int[] b = {10, 60, 30};
        int lengthOfA = a.length; //5
        int lengthOfB = b.length; //3


        //part 1

        if (a[0] == b[0]) {
            System.out.println("have the same first elements");
        }

        //part 2

        if(a[lengthOfA-1] == b[lengthOfB-1]){ // a[5]
            System.out.println("have the same last elements");
        }
        //part 3

        if (a[lengthOfA/2] == b[lengthOfB/2]){
            System.out.println("middle");
        }
        //part 4 homework

        for(int i = 0 ; i < a.length & i < b.length; i++) {

             if (a[0] == b[0]){

                System.out.println(" arrays are same");}

            }


        }
    }

