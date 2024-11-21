package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_all_members_introduce_when_school_start() {
        // Given
        School school = new School();
        Klass klass = new Klass(1);

        Teacher tom = new Teacher(1, "Tom", 30);
        tom.assignTo(klass);
        school.addMember(tom);

        Student jerry = new Student(2, "Jerry", 18);
        jerry.join(klass);
        school.addMember(jerry);

        // When
        school.startSchool();

        // Then
        String output = systemOut();
        assertThat(output).contains("My name is Tom. I am 30 years old. I am a teacher. I teach Class 1.");
        assertThat(output).contains("My name is Jerry. I am 18 years old. I am a student. I am in class 1.");
    }

    private String systemOut() {
        return outContent.toString();
    }
}