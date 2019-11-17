package Day32;

public class Rectangle2 {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.a = 3;
        rec.b = 5;
        int area = rec.getArea();
        System.out.println(area);
        int parameter = rec.getPerimeter();
        System.out.println(parameter);

    }
}
