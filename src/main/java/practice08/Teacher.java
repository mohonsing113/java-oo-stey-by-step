package practice08;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null || klass.getNumber() == 0) {
            return String.format(super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", klass.getDisplayName());
    }

    public String introduceWith(Student student) {
        if (student.getKlass() == klass) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", name, age, student.getName());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I don't teach %s.", name, age, student.getName());
        }
    }
}
