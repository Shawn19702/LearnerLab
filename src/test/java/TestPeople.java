import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

        People people = new People();

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(235257L, "Shawn"));

        people.setPersonList(personList);

        Person expected = personList.get(0);

        Person actual = people.findPersonById(235257L);

        Assertions.assertEquals(expected, actual);

    }


}
