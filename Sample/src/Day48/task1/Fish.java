package Day48.task1;

public class Fish implements Animal {
    @Override
    public void sound() {
        System.out.println("silent");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food.getName()+" " +food.getCal());
    }




}
