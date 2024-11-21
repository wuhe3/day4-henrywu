package oo;

import java.util.Objects;

public class Klass {
    private final Integer classNum;

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
}
