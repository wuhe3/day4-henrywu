package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private final Integer classNum;
    private Student leader;
    private List<Teacher> teachers;
    private List<Student> students;

    public Klass(Integer classNum) {
        this.classNum = classNum;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(classNum, klass.classNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classNum);
    }

    public Integer getClassNum() {
        return classNum;
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
    }

    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            leader = student;
            notifyMembers(student);
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void attach(Person person) {
        if (person instanceof Teacher) {
            teachers.add((Teacher) person);
        } else if (person instanceof Student) {
            students.add((Student) person);
        }
    }

    private void notifyMembers(Student newLeader) {
        for (Teacher teacher : teachers) {
            System.out.printf("I am %s, teacher of Class %d. I know %s become Leader.%n",
                    teacher.name, this.classNum, newLeader.name);
        }
        for (Student student : students) {
            System.out.printf("I am %s, student of Class %d. I know %s become Leader.%n",
                    student.name, this.classNum, newLeader.name);
        }
    }
}