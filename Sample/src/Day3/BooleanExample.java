package Day3;

public class BooleanExample {
    /*
    &&, Logical AND : returns true when both conditions are true.
    ||, Logical OR : returns true if at least one condition is true.
 */
    public static void main(String[] args) {
        boolean falseBool = false;
        boolean trueBool = true;
        // 1. write program which will test this :
        // a. true && true => true
        // b. false && true => false
        // c. true && false => false
        // d. false && false => false;

        System.out.println("Logical AND Operation");
        System.out.println("true && true => " + (trueBool && trueBool));
        System.out.println("false && true => " + (falseBool && trueBool));
        System.out.println("true && false => " + (trueBool && falseBool));
        System.out.println("false && false => " + (falseBool && falseBool));

        System.out.println();



//        Logical OR : returns true if at least one condition is true.
//        Logical sign OR in JAVA is => ||
        // 2. write program which will test this :
        // a. true  || true => ?
        // b. false || true => ?
        // c. true  || false => ?
        // d. false || false => ?

        System.out.println("Logical OR Operation");
        System.out.println("true || true => " + (trueBool || trueBool));
        System.out.println("false || true => " + (falseBool || trueBool));
        System.out.println("true || false => " + (trueBool || falseBool));
        System.out.println("false || false => " + (falseBool || falseBool));

//        System.out.println(true && true || false && false); => true
//        System.out.println(true && (true || false) && (false || true) && true || false || true || false); => true
    }
}
