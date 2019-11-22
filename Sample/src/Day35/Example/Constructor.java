package Day35.Example;

public class Constructor {
    int value;
    public  Constructor(int val){
        value = val;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(5);
        System.out.println(c1.value);
    }
}
