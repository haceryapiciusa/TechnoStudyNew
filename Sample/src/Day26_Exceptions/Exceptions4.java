package Day26_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;//FileNotFoundException

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found;");
            System.out.println(ex.getStackTrace());
        }

    }
}
