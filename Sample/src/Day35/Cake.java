package Day35;

public class Cake {
    //2 attributes
    //int fruits
    //string color

    //create constructor (with 2 parameters)

    //create constructor (with 1 parameters)
    //call main calls and print out the results
    int fruits;
    String colors;
    public Cake (int fruit,String color){
        fruits = fruit;
        colors = color;
    }

    public static void main(String[] args) {
        Cake cake = new Cake(2,"red");
        System.out.println(cake.fruits+ "" +cake.colors);
    }

}
