package day16;

public class MultiDimrnsionalArraysTask1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames

    //part2. print them name and surname, without loop

    public static void main(String[] args) {
        String[][] namesAndSurnames = {

                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"},

                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},
        };

        System.out.println("part2---------------------------");
        //part2
        System.out.println(namesAndSurnames[0][0] + " " + namesAndSurnames[1][0]);
        System.out.println(namesAndSurnames[0][1] + " " + namesAndSurnames[1][1]);
        System.out.println(namesAndSurnames[0][2] + " " + namesAndSurnames[1][2]);
        System.out.println(namesAndSurnames[0][3] + " " + namesAndSurnames[1][3]);


        System.out.println("part3---------------------------");
        System.out.println("columns at row 0: " + namesAndSurnames[0].length);
        //part3
        //USING ONLY ONE LOOP print names and surnames
        //ex:
        //Bayram Guney
        //Micheal Jackson
        for (int i = 0; i < namesAndSurnames[0].length; i++) {
            System.out.println(namesAndSurnames[0][i] + " " + namesAndSurnames[1][i]);
        }

        System.out.println("=======");



        for (int row = 0; row < namesAndSurnames.length; row++) {
            System.out.println(row);
            for (int col = 0; col < namesAndSurnames[row].length; col++)
            System.out.println("name: " + namesAndSurnames[row][col] +" ");
        }
        System.out.println();

        System.out.println("======> Homework part 4");


        for (int row = 0; row < namesAndSurnames.length-1;row++) {
            for (int col = 0;col< namesAndSurnames[row].length;col++) {
                System.out.println(namesAndSurnames[row][col] + " " + namesAndSurnames[row+1][col]);
            }
        }System.out.println();
    }
    }
