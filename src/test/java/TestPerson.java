import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    public void TestConstructor(){
        Person person = new Person(106L, "John");

        long expectedId = 106L;
        String expectedName = "John";

        Assertions.assertEquals(expectedId, person.getId());
        Assertions.assertEquals(expectedName, person.getName());

    }

    @Test
    public void testSetName() {
        Person person = new Person(6966L, "Bob");

        String expected = "Bob";

        person.setName(expected);
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }


}
