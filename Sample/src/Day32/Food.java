package Day32;

public class Food {
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
}
