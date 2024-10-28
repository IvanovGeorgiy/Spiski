public class StudentInfo {
    String name;
    int age;
    public StudentInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " age: " + this.age;
    }
}
