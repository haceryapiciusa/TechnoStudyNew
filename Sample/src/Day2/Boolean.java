package Day2;

public class Boolean {
    public static void main(String[] args) {
        boolean falseBool = false;
        boolean trueBool = true;
        System.out.println(trueBool && trueBool);
        System.out.println(falseBool && trueBool);
        System.out.println(trueBool && falseBool);
        System.out.println(falseBool && falseBool);


        System.out.println(true || true);
        System.out.println(falseBool || trueBool);
        System.out.println(trueBool || falseBool);
        System.out.println(falseBool || falseBool);

    }
}
