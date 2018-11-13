package practice10;

import java.util.*;

public class Teacher extends Person {
    LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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
            if(i!=classes.size()-1){
                display+=", ";
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

    public LinkedList<Klass> getClasses() {
        return classes;
    }
    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }
}
