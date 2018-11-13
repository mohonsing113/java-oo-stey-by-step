package practice08;

public class Student extends Person{
    Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        return String.format(super.introduce()+" I am a Student. I am at "+getKlass().getDisplayName() +".");
    }
}
