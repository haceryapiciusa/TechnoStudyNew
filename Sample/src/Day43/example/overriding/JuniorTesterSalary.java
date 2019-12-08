package Day43.example.overriding;
// junior take 50,000 less than base
public class JuniorTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary() {
        return super.getSalary() - 50_000;
    }

    public int testSumOfJuniorSalary (){
        int first = getSalary();
        int second = getSalary();
        int third = getSalary();
        int sum = first+second+third;
        return sum;

    }
}
