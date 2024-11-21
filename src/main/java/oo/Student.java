package oo;


public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(String.format(" I am a student. I am in class %d.", klass.getClassNum()));
    }


    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return (this.klass == klass);
    }
}
