package Day40.task;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void getName() {
        Person p = new Person();
        p.setName("Techno");
        String actual = p.getName();
        String expected = "Techno";
        Assert.assertEquals(actual, expected);

    }

    @Test
    void setName() {

    }


}