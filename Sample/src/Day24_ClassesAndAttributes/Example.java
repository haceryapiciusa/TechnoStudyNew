package Day24_ClassesAndAttributes;
class OtherClass {
    public static void main(String[] args) {
        Example myObj = new Example();
        Example.y = 54;
        System.out.println(Example.y);
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        myObj.TechnoStudyMethodPrivate();
    }
}

public class Example {

    int x = 5;
    static int y = 45;
    public static void main(String[] args) {
        Example ex2 = new Example();
        System.out.println(ex2.x);
        System.out.println(ex2.y);
        y=45;
        TechnoStudyMethod();
        TechnoStudyMethod2();

        Day25JavaMethods2.Example ex = new Day25JavaMethods2.Example();
        Day25JavaMethods2.Example.method();

    }



    public static void TechnoStudy() {
        System.out.println("try ex.");
    }

    public static void TechnoStudyMethod() {
        System.out.println("heeey");

    }
    public void TechnoStudyMethodPrivate() {
        System.out.println("hello");
        x = 5;

    }


    private static void TechnoStudyMethod2(){

    }
    Day25JavaMethods2.Example ex = new Day25JavaMethods2.Example();

    public void TechnoStudyPrivate() {
        System.out.println("call");
    }
}
