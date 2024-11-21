package oo;

public class Teacher extends Person {
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a teacher.");
    }
}
