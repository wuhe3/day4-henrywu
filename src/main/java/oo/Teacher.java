package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        this.classes = new ArrayList<>();
    }

    public void assignTo(Klass klass) {
        if (!classes.contains(klass)) {
            classes.add(klass);
            klass.attach(this);
        }
    }

    public boolean belongsTo(Klass klass) {
        return classes.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return classes.stream()
                .anyMatch(student::isIn);
    }

    @Override
    public String introduce() {
        if (classes.isEmpty()) {
            return super.introduce().concat(" I am a teacher.");
        }

        String classNumbers = classes.stream()
                .map(Klass::getClassNum)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        return super.introduce().concat(String.format(" I am a teacher. I teach Class %s.", classNumbers));
    }
}