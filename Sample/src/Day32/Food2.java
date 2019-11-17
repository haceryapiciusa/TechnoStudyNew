package Day32;

public class Food2 {
    public static void main(String[] args) {
        Food food = new Food();
        food.price1 = 3;
        food.price2 = 6;
        int total = food.getTotal();
        System.out.println(total);
        double average = food.getAverage();
        System.out.println(average);
    }
}
