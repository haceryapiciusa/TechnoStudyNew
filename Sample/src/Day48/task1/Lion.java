package Day48.task1;

public class Lion implements Animal {

    @Override
    public void sound() {
        System.out.println("Lion is Roaring!");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food.getName()+" " +food.getCal());
    }




}
