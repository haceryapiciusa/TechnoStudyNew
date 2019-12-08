package Day43.example.overriding;
// senior get 100,000 more than base
public class SeniorTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary() {
        return super.getSalary() + 100_000;
    }
}

