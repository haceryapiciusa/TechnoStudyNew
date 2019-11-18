package Day32.example;
class MyMath{
    public static int sum(int a, int b){
        return a+b;
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        int total = MyMath.sum(10,30);
        System.out.println("total: "+total);
    }
}
