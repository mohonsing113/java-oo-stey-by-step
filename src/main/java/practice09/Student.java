package practice09;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.leader == this) {
            return String.format(super.introduce() + " I am a Student. I am Leader of " + getKlass().getDisplayName() + ".");
        } else {
            return String.format(super.introduce() + " I am a Student. I am at " + getKlass().getDisplayName() + ".");
        }
    }
}
