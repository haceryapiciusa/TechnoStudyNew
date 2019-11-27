package Day36.example;

import java.io.File;
import java.io.FileReader;

public class Exception4 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        } catch (Exception ex) {
            System.out.println("File not found;");
            System.out.println(ex.getStackTrace());
        }
    }
}
