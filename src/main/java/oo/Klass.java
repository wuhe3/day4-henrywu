package oo;

import java.util.Objects;

public class Klass {
    private final Integer classNum;
    private Student leader;

    public Klass(Integer classNum) {
        this.classNum = classNum;


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
        } else {
            System.out.println("It is not one of us.");
        }
    }
}
