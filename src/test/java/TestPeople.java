import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPeople {


    People people;

    @BeforeEach
    public void setUpBeforeEach() {
        people  = new People();
    }

    @Test
    public void addTest() {
        int expected =1;

        people.add(new Person(4345L, "Shawn"));

        Assertions.assertEquals(expected, people.ArraylistSize());

    }

    @Test
    public void RemoveNameTest() {
        int expected = 0;

Person person = new Person(53364L, "Shawn");

        people.add(person);

        people.RemovePersonObjecttoPersontoPersonList(person);

        Assertions.assertEquals(expected, people.ArraylistSize());


    }

    @Test
    public void testFindId(){

        long expected = 53364L;


        Person person = new Person(53364L, "Shawn");

person.getId();

        Assertions.assertEquals(expected, person.getId());

    }


}
