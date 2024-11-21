package oo;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(generateStudentIntroduction());
    }

    private String generateStudentIntroduction() {
        if (klass == null) {
            return " I am a student.";
        }

        return String.format(" I am a student. %s",
                klass.isLeader(this)
                        ? String.format("I am the leader of class %d.", klass.getClassNum())
                        : String.format("I am in class %d.", klass.getClassNum())
        );
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.attach(this);
    }

    public boolean isIn(Klass klass) {
        return (this.klass == klass);
    }
}