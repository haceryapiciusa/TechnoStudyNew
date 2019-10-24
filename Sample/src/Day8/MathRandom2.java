package Day8;

public class MathRandom2 {
    public static void main(String[] args) {
        //double r = Math.random()+ 10 ;
        //System.out.println(r);


        //Task2: print 2 random numbers between 0 and 10;
        //ex1:
        //    4
        //    5
        //ex2:
        //    1
        //    2
        double d1 = Math.random();
        System.out.println(d1);
        System.out.println(d1 * 10);
        int i1 = (int) (d1 * 10);
        System.out.println(i1);

        System.out.println("---------------");
        //0 - 1000
        System.out.println((Math.random()*1000));

        //sample
        // 0.2 * 10 => 2
        //


        System.out.println((int)(Math.random()*3));
        double n = Math.random();
        System.out.println(n *2);

        System.out.println("------------");

        // 1. way
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 10));

        System.out.println("-----------------------------------------");
        // 2. way
        int max = 10;

        double r1 = Math.random() * max;
        int i2 = (int) r1; // gets integer form double
        System.out.println(i1);

        double r2 = Math.random() * max;
        int i3 = (int) r2; // gets integer form double
        System.out.println(i2);




    }
}
