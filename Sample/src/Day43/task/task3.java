package Day43.task;

import Day43.example.overriding.JuniorTesterSalary;
import Day43.example.overriding.MiddleTesterSalary;
import Day43.example.overriding.SeniorTesterSalary;
import Day43.example.overriding.TesterBaseSalary;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class task3 {
    // Create class TesterBaseSalary
    // add method getSalary which will
    // return $100,000 as salary

    // create subclasses JuniorTesterSalary,
    // MiddleTesterSalary,
    // SeniorTesterSalary

    // junior take $50,000 less than base
    // middle gets $10,000 more than base
    // senior get $100,000 more than base

    // using polymorphism create methods in subclasses
    // 110,000  for middle

    // Hint: use super keyword to call method in base/parent class


    @Test
    public void testBaseSalary() {
        TesterBaseSalary s = new TesterBaseSalary();
//        Assert.assertEquals(100_000, s.getSalary());

        int actual = s.getSalary();
        int expected = 100_000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJunior() {
        JuniorTesterSalary j = new JuniorTesterSalary();
        Assert.assertEquals(50_000, j.getSalary());
    }

    @Test
    public void testMiddle() {
        MiddleTesterSalary m = new MiddleTesterSalary();
        Assert.assertEquals(110_000, m.getSalary());

    }

    @Test
    public void testSenior() {
        SeniorTesterSalary m = new SeniorTesterSalary();
        Assert.assertEquals(200_000, m.getSalary());

    }
//benim yaptigim
//    @Test
//    public void testSumOfJuniorSalary(){
//        JuniorTesterSalary sum = new JuniorTesterSalary();
//        Assert.assertEquals(150_000,sum.testSumOfJuniorSalary());
//        // create 3 junior testers, sum their salary, and check if you have $150,000 in total
//    }
//hocanin yaptigi
    @Test
    public void testSumOfThreeJuniorSalary() {
        // create 3 junior testers, sum their salary, and check if you have $150,000 in total
//        TesterBaseSalary j1 = new JuniorTesterSalary();
//        TesterBaseSalary j2 = new JuniorTesterSalary();
//        TesterBaseSalary j3 = new JuniorTesterSalary();
//        int actual = j1.getSalary() + j2.getSalary() + j3.getSalary();

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            TesterBaseSalary junior = new JuniorTesterSalary();
            sum += junior.getSalary();
        }
        int actual = sum;

        Assert.assertEquals(150_000, actual);

    }

    @Test
    public void testSumOfNMiddleSalary() {
        // create N middle testers, sum their salary, and check if you have N*$ 110_000 in total
        // where N > 100
        int N = 1000;
        int sum = 0;
        for (int i = 0; i < N; i++) { // 0 1 2
            TesterBaseSalary junior = new MiddleTesterSalary();
            sum += junior.getSalary();
        }

        int actual = sum;
        Assert.assertEquals(N * 110_000, actual);

    }

}


