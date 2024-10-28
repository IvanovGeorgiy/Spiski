import java.util.Scanner;

public class CoolStudent {
    String name;
    int age;
    CoolStudent next;
    CoolStudent previous;

    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        System.out.println("Введите имя студента");
        this.name = sc.nextLine();
        System.out.println("Введите возраст студента");
        this.age = sc.nextInt();
    }
    public Object getData() { return new StudentInfo(this.name, this.age); }
    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public CoolStudent getNext() { return this.next; }
    public CoolStudent getPrevious(){ return this.previous; }
    public void setNext(CoolStudent nextStudent) {
        this.next = nextStudent;
        nextStudent.previous = this;
    }
    public void setPrevious(CoolStudent previousStudent) {
        this.previous = previousStudent;
        previousStudent.next = this;
    }
    @Override
    public String toString() {
        String output ="";
        output = "student name = " + this.name + " age = " + this.age;
        return output;
    }
}
