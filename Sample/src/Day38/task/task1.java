package Day38.task;
// write a program that will count every time when you create an object

// HINT:
// 1. create class Counter
// 2. add attribute [int count = 0]
// 3. increment value of count in default constructor of Counter class
// 4. print count in default constructor of Counter class
// increment value of count in default constructor of Counter

class Counter{
    //write you code here
    public static int  count = 0;//put static see the difference

    public Counter(){
        count++;
        System.out.println("Default Constructor");
        System.out.println("Count is: " + count);

    }
    //end of code
}

public class task1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println("--------------------------");
        Counter c2 = new Counter();
        System.out.println("--------------------------");
        Counter c3 = new Counter();
    }

}
