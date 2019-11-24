package Day37.Example.stringBuffer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Ex3 {

    //Using StringBuffer create English alphabet
    //Hint1: you can use ASCII table
    //Hint2: loop(from 'A' to 'Z')
    // return "ABC........XYZ" all 26 letters
    public String getAlphabet() {
        StringBuffer sb = new StringBuffer();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            sb.append(letter);
        }
        return sb.toString();
    }

    //Using StringBuffer get only vowels from alphabet

    public String getVowels(String str) {
        StringBuffer sb = new StringBuffer();
        for(char vowel = 'A'; vowel <= 'Z'; vowel++){
            if(vowel == 'A'|| vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U'){
                sb.append(vowel);
            }
        }
        return sb.toString();

    }

        @Test
    public void test() {
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = getAlphabet();

        Assert.assertEquals(expected, actual);
    }

}
