package practice11;

import java.util.*;

public class Teacher extends Person {
    LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (classes == null || classes.size() == 0) {
            return String.format(super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", buildClassDisplayName());
    }

    public String buildClassDisplayName() {

        String display = "Class ";
        for (int i = 0; i < classes.size(); i++) {
            display += classes.get(i).getNumber();
            if (i != classes.size() - 1) {
                display += ", ";
            }
        }
        return display;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", name, age, student.getName());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I don't teach %s.", name, age, student.getName());
        }
    }

    public void beNotice(String result) {
        System.out.print(result);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public void noticeNewLeader(String name, String className) {
        System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", getName(), name, className));
    }

    public void noticeNewMember(String name, String className) {
        System.out.print(String.format("I am %s. I know %s has joined %s.\n", getName(), name, className));
    }
}
