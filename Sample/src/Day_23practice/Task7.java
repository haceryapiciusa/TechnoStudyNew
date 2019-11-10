package Day_23practice;

public class Task7 {
    // given arrayList of chars
    // print true if they have repetitive letters
    // {'A','B','B'} => true
    // {'C','D'} => false
    public static void main(String[] args) {
        char[] charray = {'A','B','B'};
        int counter = 0;
        boolean repeat = false;
        boolean nonrepeat = false;

        for (char c : charray) {
            if (c == 'B') {
                repeat = true;
                counter++;
            }
        }
            if (counter >= 2) {
                System.out.println(repeat);
            } else {
                System.out.println(nonrepeat);
            }


        }

    }

