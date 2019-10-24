package Day13;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {
    public static void main(String[] args) {
        String a = "Technostudy";
        a = a.replaceAll("[eou]", "X");
        System.out.println(a);
    }
    static String remVowel(String str)
    {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }
}
