package Day36.example;

public class JavaExceptions2 {
    //    https://www.javatpoint.com/exception-handling-in-java


//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
//https://www.geeksforgeeks.org/errors-v-s-exceptions-in-java/
//https://www.geeksforgeeks.org/built-exceptions-java-examples/


    //
//class TECHNO4 {
//    public
//    static void main(String[] args)
//    {
//        throw new ArithmeticException();
//    }
//}
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO5 {
//    static ArithmeticException ae = new ArithmeticException();
//    public static void main(String[] args)
//    {
//        throw ae;
//    }
//}
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO6 {
//    static ArithmeticException ae;
//    public
//    static void main(String[] args)
//    {
//        throw ae;
//    }
//}
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:NullPointerException
////3. No Output
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO7 {
//    public static void main(String[] args)
//    {
//        throw new ArithmeticException("/ by zero");
//        System.out.println("Hello TECHNO");
//    }
//}
////Options:
////1. Run-time Exception
////2. Compile-time error
////3. No Output
////4. Compile-time Exception
//
//class TECHNO8 {
//    public
//    static void main(String[] args)
//    {
//        throw new TECHNO();
//        System.out.println("Hello TECHNO");
//    }
//}
////Options:
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile-time error
////
////The answer is option (4)


//class TECHNO throws ArithmeticException
//{
//    public static void main(String[]args) throws ArithmeticException
//    {
//        System.out.println(10/0);
//        System.out.println("Hello TECHNO");
//    }
//}
//
////Options:
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile time error
//
//class TECHNO2 {
//    public static void main(String[] args) throws TECHNO2 {
//        Thread.sleep(10000);
//        System.out.println("Hello TECHNO");
//    }
//}
////Options:
////1. Hello TECHNO
////2. compile time error
////3. No Output
////4. Run-time exception
//
//class Test {
//    void m1() throws ArithmeticException {
//        throw new ArithmeticException("Calculation error");
//    }
//
//    void m2() throws ArithmeticException {
//        m1();
//    }
//
//    void m3() {
//        try {
//            m2();
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//        }
//    }
//
//    public static void main(String args[]) {
//        Test t = new Test();
//        t.m3();
//        System.out.println("Handled by TECHNO");
//    }
//}
////Options:
////1. Calculation error
////2. ArithmeticException
////3. Handled by TECHNO
////4. ArithmeticException Handled by TECHNO
//
//class Test2 {
//    void Div() throws ArithmeticException {
//        int a = 25, b = 0, rs;
//        rs = a / b;
//        System.out.print("\n\tThe result is : " + rs);
//    }
//
//    public
//    static void main(String[] args) {
//        Test2 t = new Test2();
//        try {
//            t.Div();
//        } catch (ArithmeticException e) {
//            System.out.print("\n\tError : " + e.getMessage());
//        }
//        System.out.print("\n\tBYE TECHNO");
//    }
//}
////Options:
////1. BYE TECHNO
////2. Compile time error
////3. Error: / by zero
////4. Error : / by zero
////BYE TECHNO
//
//class Test3 {
//    public static void main(String[] args) {
//        fun();
//    }
//
//    public static void fun() {
//        moreFun();
//    }
//
//    public static void moreFun() throws InterruptedException {
//        Thread.sleep(10000);
//        System.out.println("TECHNO");
//    }
//}
////Options:
////1. TECHNO
////2. No Output
////3. Compile time error
////4. Run-time Exception


//public class Test9
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            System.out.printf("1");
//            int sum = 9 / 0;
//            System.out.printf("2");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.printf("3");
//        }
//        catch(Exception e)
//        {
//            System.out.printf("4");
//        }
//        finally
//        {
//            System.out.printf("5");
//        }
//    }
//}
////a) 1325
////b) 1345
////c) 1342
////d) 135
//public class Test10
//{
//    private void m1()
//    {
//        m2();
//        System.out.printf("1");
//    }
//    private void m2()
//    {
//        m3();
//        System.out.printf("2");
//    }
//    private void m3()
//    {
//        System.out.printf("3");
//        try
//        {
//            int sum = 4/0;
//            System.out.printf("4");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.printf("5");
//        }
//
//
//        System.out.printf("7");
//    }
//    public static void main(String[] args)
//    {
//        Test obj = new Test();
//        obj.m1();
//    }
//}
////a) 35721
////b) 354721
////c) 3521
////d) 35
//public class Test11
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            System.out.printf("1");
//            int data = 5 / 0;
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.printf("2");
//            System.exit(0);
//        }
//        finally
//        {
//            System.out.printf("3");
//        }
//        System.out.printf("4");
//    }
//}
////a) 12
////b) 1234
////c) 124
////d) 123
//public class Test12
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            System.out.printf("1");
//            int data = 5 / 0;
//        }
//        catch(ArithmeticException e)
//        {
//            Throwable obj = new Throwable("Sample");
//            try
//            {
//                throw obj;
//            }
//            catch (Throwable e1)
//            {
//                System.out.printf("8");
//            }
//        }
//        finally
//        {
//            System.out.printf("3");
//        }
//        System.out.printf("4");
//    }
//}
////a) Compilation error
////b) Runtime error
////c) 1834
////d) 134
//public class Test13
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            System.out.printf("1");
//            int value = 10 / 0;
//            throw new IOException();
//        }
//        catch(EOFException e)
//        {
//            System.out.printf("2");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.printf("3");
//        }
//        catch(NullPointerException e)
//        {
//            System.out.printf("4");
//        }
//        catch(IOException e)
//        {
//            System.out.printf("5");
//        }
//        catch(Exception e)
//        {
//            System.out.printf("6");
//        }
//    }
//}
////a) 1346
////b) 136726
////c) 136
////d) 13

}
