package Day32;

public class Food {

        public String name;
        public String sideDish;
        public String ingredients;
        public String oil;
        public int amountOfIngredients;

        public boolean hasButter(String text) {
            if (oil.equals(text)) {
                return true;
            } else {
                return false;
            }
        }

        public void taste() {
            if (amountOfIngredients == 2) {
                System.out.println("OK");
            } else if (amountOfIngredients == 3) {
                System.out.println("Delicious");
            } else if (amountOfIngredients == 6) {
                System.out.println("Mouthwatering");
            }
        }
//    public static void main(String[] args) {
//
//        Food pilav = new Food();
//
//        pilav.name = "Ozbek Pilavi";
//        pilav.sideDish = "Yoghurt";
//        pilav.ingredients = "meat, rice, carrot, onion, garlic, butter";
//        pilav.oil = "butter";
//        pilav.amountOfIngredients = 6;
//
//        pilav.taste();
//
//        boolean boo = pilav.hasButter("butter");
//        System.out.println(boo);
//    }
    }

