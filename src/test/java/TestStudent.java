import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudent {
    @Test
    public void StudentLearnerTest() {
        Student student = new Student(70760L, "Shawn");

        boolean actual = student instanceof Learner;

        Assertions.assertTrue(actual);


    }

    @Test
    public void StudentPersonTest() {


        Student student = new Student(70660L, "Ryan");

        boolean actual = student instanceof Person;

        Assertions.assertTrue(actual);

    }

    @Test
    public void testLearn() {
        Student student = new Student(7070L, "Raul");
        Double expected = 8.0;
        student.learn(8);
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }
}
