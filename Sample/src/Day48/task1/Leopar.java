package Day48.task1;

public class Leopar implements Animal {
    @Override
    public void sound() {
        System.out.println("Leopar is Roaring!");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food.getName()+" " +food.getCal());
    }




}
