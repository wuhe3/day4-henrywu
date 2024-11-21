package oo;

import java.util.Objects;

public class Person {
    protected final Integer id;
    protected final String name;
    protected final Integer age;

    public Person (Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return ("My name is " + name + ". I am " + age + " years old.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
