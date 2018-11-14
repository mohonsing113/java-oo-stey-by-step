package practice11;

import java.util.*;

public class Klass {
    int number;
    Person leader;
    ArrayList<Person> members;
    Teacher teacher;

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
            if (teacher != null) {
                teacher.noticeNewLeader(leader.getName(), getDisplayName());
            }
        }
    }

    public Person getLeader() {
        return leader;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void appendMember(Person person) {
        members.add(person);
        if (teacher != null) {
            teacher.noticeNewMember(person.getName(), getDisplayName());
        }
    }
}
