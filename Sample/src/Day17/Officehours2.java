package Day17;

public class Officehours2 {
    public static void main(String[] args) {
        //bir onceki ornek devami
        String[][] strarr2 = {{"USA" , "Mexico"} , {"South Korea" ,"Russia" , "China"} , {"India","Pakistan"}};

        for(int i = strarr2.length-1 ; i>=0 ; i--) {

            for (int j = strarr2[i].length - 1; j >= 0; j--) {

                char[] strarr3Chars = strarr2[i][j].toCharArray();

                for (int k = strarr3Chars.length - 1; k >= 0; k--) {

                    System.out.print(strarr3Chars[k]);
                }
                System.out.print(" ");

            }
        }
        System.out.println("=============");

        String [] arr = {"dirdaM", "anolecraB", "emoR","siraP"};
        for(int i = arr.length-1 ; i>=0 ; i--){

            char[] strarr3Chars = arr[i].toCharArray();

            for(int j = strarr3Chars.length-1 ; j>=0 ; j-- ){

                System.out.print(strarr3Chars[j]);

            }

            System.out.println();
        }

    }
}
