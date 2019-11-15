package Day25JavaMethods2;

public class Example {
    //Java Methods (Void) methods and void static method ,
    // return method (In the same class)

    public static void main(String[] args) {
        Day24_ClassesAndAttributes.Example ex = new Day24_ClassesAndAttributes.Example();
        ex.TechnoStudyMethodPrivate();

        Day24_ClassesAndAttributes.Example.TechnoStudyMethod();
        ex.TechnoStudyMethodPrivate();

        ex.TechnoStudyPrivate();

        Day24_ClassesAndAttributes.Example.TechnoStudy();

        method();
    }

    public static void method() {
        System.out.println("are you there?");
    }

}

