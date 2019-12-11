package Day48.task1;

public class Tiger extends AbstractAnimal implements Animal {


    public Tiger() {
    }

    public Tiger(String breed, double minCal, double maxCal) {
        setBreed( breed );
        setMinCal( minCal );
        setMaxCal( maxCal );
    }

    @Override
    public void sound() {
        System.out.println("Tiger is Roaring!");
    }

    @Override
    public void eat(Food food) {
        System.out.println(food.getName()+" " +food.getCal());
    }


}
