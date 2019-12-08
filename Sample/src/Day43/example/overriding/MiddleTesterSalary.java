package Day43.example.overriding;
// middle gets 10,000 more than base
public class MiddleTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary() {
        return super.getSalary() + 10_000;
    }
}
