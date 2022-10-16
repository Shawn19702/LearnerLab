import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructors {
    @Test
    public void InstructorsTest() {
        Instructors instructor = Instructors.getInstance();
        for (Instructor x : instructor.instructorsArray) {
            Assertions.assertTrue(x.getId() == 70669L || x.getId() == 69696L || x.getId() == 12345L);

        }
    }
}
