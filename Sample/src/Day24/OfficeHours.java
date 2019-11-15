package Day24;

import java.util.ArrayList;

public class OfficeHours {
    public static void main(String[] args) {
        //        verify first array equal to  second array

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Elephant");
        list1.add("Cow");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Lion");
        list2.add("Tiger");
        list2.add("Cat");
        list2.add("Cow");

        boolean result = false;

//        first use for loop and then use the if statement

        if(list1.get(0)==list2.get(0)){
            result = true;
            System.out.println(result);
        }else {
            System.out.println(false);
        }
        System.out.println("========");

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Bird");
        list4.add("Tiger");
        list4.add("Zebra");
        list4.add("Lizard");
        list4.add("Dog");
        boolean check = false;

//      please make sure list 3 contains list 4
        for (int i = 0; i <list3.size() ; i++) {
            for (int j = 0; j <list4.size() ; j++) {
                if(list3.get(i).equals(list4.get(j))){
                    check=true;
                    System.out.println(check);
                }
                else {
                    check=false;
                    break;
                }


            }


        } System.out.println(check);

    }
}
