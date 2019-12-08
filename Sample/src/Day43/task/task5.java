package Day43.task;

import Day43.example.Mushrom;
import Day43.example.Onion;
import Day43.example.Vegetable;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class task5 {
    /// create two more vegetable: Garlic, Tomato
    /// add check for onion also
    // use instanceof in your code

    public boolean checkForOnion(Vegetable v) {
        if (v instanceof Onion) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testForOnion1() {
        Mushrom obj = new Mushrom();
        boolean actual = checkForOnion(obj);

        Assert.assertFalse(actual);
    }

    @Test
    public void testForOnion2() {
        Onion obj = new Onion();
        boolean actual = checkForOnion(obj);

        Assert.assertTrue(actual);
    }

}
