package oo;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void startSchool() {
        members.forEach(person ->
                System.out.println(person.introduce())
        );
    }
}