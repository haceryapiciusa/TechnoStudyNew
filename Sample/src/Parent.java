class Parent {
    // constructors and static methods can not be overridden
    // if u write parentclass's static method in subclass, too.
    //it is called method hiding
    // data members cannot be overridden
        public static void myMethod() {
            System.out.println("Yes I am parents static");

        } public void play() {
            System.out.println("Hi");
        }
        public static void display() {
            System.out.println("a");
        }

    }

    class Child extends Parent{


        public static void myMethod() {
            System.out.println("I am child static");

        }public static void display() {
            System.out.println("b");
        }
        public void play() {

            System.out.println("Hllo");
        }




    public static void main(String[] args) {
//        Child  c=new Child();
//
//        c.myMethod();
//
//        c.display();



        Parent p= new Child();

        p.myMethod();

        p.display();

        p.play();

        //c.play();

    }
}
