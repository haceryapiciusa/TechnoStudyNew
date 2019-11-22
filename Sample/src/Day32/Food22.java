package Day32;

public class Food22 {
    // create class Food
    // add at least 5 attributes
    // add at least 2 methods
    public String name; // bread,milk,orange
    public String type; // poultry dairy
    public int price1;
    public int price2;
    public int count;
    public int getTotal (){
        return price1+price2;
    }
    public double getAverage() {
        return  (price1+price2)/2;
    }

    public static void main(String[] args) {
        Food22 food = new Food22();
        food.price1 = 3;
        food.price2 = 6;
        int total = food.getTotal();
        System.out.println(total);
        double average = food.getAverage();
        System.out.println(average);
    }
}
