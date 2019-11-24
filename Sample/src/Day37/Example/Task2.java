package Day37.Example;
// create a class which will have 3 attributes
// all attributes should be also classes!!!
// in every class you need to have at least 2 attributes
class Human{
    public String name;
    public String year;
}
class Engineer {
    public String fullName;
    public boolean hasLicense;
    public Human human;

    public Engineer ( String Humanyear,boolean hl, String Humanname ) {
        hasLicense = hl;
        human = new Human();
        human.name = Humanname;
        human.year = Humanyear;
    }

    public String toString() {
        String result = "";
        result+= "hasLicense: " + hasLicense + "\n";
        result+= "insan year: " + human.year + "\n";
        result+= "insan name: " + human.name + "\n";
        return result;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Engineer insan = new Engineer("1960",false,"Insan");
        System.out.println(insan);
    }
}
