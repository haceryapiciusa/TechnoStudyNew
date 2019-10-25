package Day14;

public class ArrayString {
    public static void main(String[] args) {

        System.out.println("Print the array Cities");
        String[] cities = {"Athens", "Thessaloniki", "Chania", "Patra", "Larissa"};

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        String[] arr = {"hi", "hello", "bye"};
        for (String str : arr) {
            System.out.println(str);
        }

    }

}
