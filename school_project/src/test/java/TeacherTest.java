import org.junit.jupiter.api.Test;
import self_work.Pupil;
import self_work.School;
import self_work.Teacher;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {
    Teacher teacher = new Teacher();
    Pupil pupil = new Pupil("Eugene", "Buyanov");
    Pupil pupil2 = new Pupil("Roman", "Pipchenko");
    Pupil pupil3 = new Pupil("Alexey", "Shnyakin");

    School school = new School();
    List<Pupil> pupils = new ArrayList<>();

    @Test
    public void checkSetAverageScore() {
        teacher.setAverageScore(pupil, 50);
        assertEquals(50, pupil.getAverageScore());
    }

    @Test
    public void checkSetAverageScoreZero() {
        teacher.setAverageScore(pupil, 0);
        assertEquals(0, pupil.getAverageScore());
    }

    @Test
    public void checkSetAverageScoreNegative() {
        teacher.setAverageScore(pupil, -5);
        assertEquals(-5, pupil.getAverageScore());
    }

    @Test
    public void checkSetAverageScoreHighValue() {
        teacher.setAverageScore(pupil, 9999);
        assertEquals(9999, pupil.getAverageScore());
    }

    @Test
    public void checkIfPupilBelowPass() {
        teacher.setAverageScore(pupil, 70);
        assertEquals(false, teacher.isPassed(pupil));
    }

    @Test
    public void checkIfPupilNegative() {
        teacher.setAverageScore(pupil, -5);
        assertEquals(false, teacher.isPassed(pupil));
    }

    @Test
    public void checkIfPupilPassed() {
        teacher.setAverageScore(pupil, 71);
        assertEquals(true, teacher.isPassed(pupil));
    }

    @Test
    public void checkSchoolSuccess() {
        pupils.add(pupil);
        pupils.add(pupil2);
        pupils.add(pupil3);
        teacher.setAverageScore(pupil, 75);
        teacher.setAverageScore(pupil2, 80);
        teacher.setAverageScore(pupil3, 99);
        school.setPupils(pupils);
        assertEquals(true, teacher.isSchoolSuccess(school));
    }

    @Test
    public void checkSchoolNotSuccess() {
        pupils.add(pupil);
        pupils.add(pupil2);
        pupils.add(pupil3);
        teacher.setAverageScore(pupil, 10);
        teacher.setAverageScore(pupil2, 20);
        teacher.setAverageScore(pupil3, 30);
        school.setPupils(pupils);
        assertEquals(false, teacher.isSchoolSuccess(school));
    }

}