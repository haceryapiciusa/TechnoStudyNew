package Day48.task1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> populateList() {

        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            animals.add(new Leopar());
        }
        for (int i = 0; i < 3; i++) {
            animals.add(new Lion());
        }
        for (int i = 0; i < 2; i++) {
            animals.add(new Tiger());
        }
        animals.add(new Fish());
        return animals;
    }

    private static void printAnimalSounds(List<Animal> animals) {

        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static void checkForSpecialAnimalFish(List<Animal> animals) {
        for(Animal animal : animals) {
            if(animal instanceof Fish){
                System.out.println("I've special animal in my Zoo");
            }
        }
        System.out.println("----------------------");
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Animal> animals = zoo.populateList();

        // print sounds
        printAnimalSounds( animals );

        // instanceof
        checkForSpecialAnimalFish( animals );

        Food tigerfood = new Food("meat",3.4,4000);
        Food lionfood = new Food("meat",3.4,4000);
        Food leoparfood = new Food("meat",3.4,4000);
        Food fishfood = new Food("Algea Wafer",1.4,40);

        Tiger tiger = new Tiger();
        tiger.eat(tigerfood);
        tiger.setMaxCal( 1000 );
        tiger.setMinCal( 700 );
        Lion lion = new Lion();
        lion.eat(lionfood);
        Leopar leopar = new Leopar();
        leopar.eat(leoparfood);


    }


}
