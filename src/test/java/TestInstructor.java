import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructor {
    @Test
    public void InstructorInstanceofTeacher() {

        Instructor instructor = new Instructor(70760L, "Shawn");

        boolean actual = instructor instanceof Teacher;

        Assertions.assertTrue(actual);
    }

    @Test
    public void InstructorInstanceofPerson() {

        Instructor instructor = new Instructor(70760L, "Shawn");

        boolean actual = instructor instanceof Person;

        Assertions.assertTrue(actual);


    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(44474L, "Shawn");
        Student student = new Student(8989L, "Ryan");
        double expected = 18.0;
        instructor.teach(student, 18.0);

        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(593096L, "Shawn");
        Student student = new Student(59696L, "Ryan");
        Student student2 = new Student(69704L, "John");

        Student[] students = {student, student2};
        instructor.lecture(students, 12);
        Double expected = 6.0;
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }
}
