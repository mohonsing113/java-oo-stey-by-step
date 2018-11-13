package practice09;

import java.util.*;

public class Klass {
    int number;
    Person leader;
    ArrayList<Person> members;

    public Klass(int number) {
        this.number = number;
        members = new ArrayList<>();
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Person leader) {
        if (!members.contains(leader)) {
            System.out.print("It is not one of us.\n");
            this.leader = new Person();
        } else {
            this.leader = leader;
        }
    }

    public Person getLeader() {
        return leader;
    }

    public void appendMember(Person person) {
        members.add(person);
    }
}
