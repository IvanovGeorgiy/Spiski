import java.util.Scanner;

public class Student {
    String name;
    int age;
    Student next;

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
    public Student getNext() { return this.next; }
    public void setNext(Student nextStudent) { this.next = nextStudent; }
    @Override
    public String toString() {
        String output ="";
        output = "student name = " + this.name + " age = " + this.age;
        return output;
    }
}
