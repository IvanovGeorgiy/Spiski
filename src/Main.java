public class Main {
    public static void main(String[] args) {
        /*List students = new List();
        students.add();
        students.add();
        students.add();
        System.out.println(students);
        students.remove(-1);
        System.out.println(students);
        System.out.println(students.get(-1));
        System.out.println(students.get(0));
        students.remove(0);
        System.out.println(students);
        System.out.println(students.size());
        students.clear();
        System.out.println(students);
        System.out.println(students.isEmpty());*/

        CoolList coolStudents = new CoolList();
        coolStudents.add();
        coolStudents.add();
        coolStudents.add();
        System.out.println(coolStudents);
        coolStudents.remove(-1);
        System.out.println(coolStudents);
        System.out.println(coolStudents.get(-1));
        System.out.println(coolStudents.get(0));
        coolStudents.remove(0);
        System.out.println(coolStudents);
        System.out.println(coolStudents.size());
        coolStudents.clear();
        System.out.println(coolStudents);
        System.out.println(coolStudents.isEmpty());
    }
}