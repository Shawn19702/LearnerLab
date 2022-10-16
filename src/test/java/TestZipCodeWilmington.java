import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestZipCodeWilmington {

    @Test
    void testHostLecturewithTeacher() {
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor instructor = cohort.getInstructors().instructorsArray[0];

        cohort.hostLecture(instructor, 60.0);

        for (Student x : cohort.getStudents().studentsArray){
            assertTrue(x.getTotalStudyTime() == 60.00 || x.getTotalStudyTime() == 30 || x.getTotalStudyTime() == 20);

            }
        }

        @Test
        void testHostLectureWithID(){
            ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();

            cohort.hostLecture(70669L, 81.00);

            for (Student x : cohort.getStudents().studentsArray){
                assertTrue(x.getTotalStudyTime() == 81.00 || x.getTotalStudyTime() == 40.5 || x.getTotalStudyTime() == 27);
            }
        }


    }
