package practice06;

public class Teacher extends Person{
    int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass ==0){
            return String.format(super.introduce()+" I am a Teacher. I teach No Class." );
        }
        return String.format(super.introduce()+" I am a Teacher. I teach Class %s.", klass);
    }
}
