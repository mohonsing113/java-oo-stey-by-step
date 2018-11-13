package practice08;

public class Klass {
    int number;
    Person leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public int getNumber() {
        return number;
    }
    public void assignLeader(Person leader){
        this.leader=leader;
    }

    public Person getLeader() {
        return leader;
    }
}
