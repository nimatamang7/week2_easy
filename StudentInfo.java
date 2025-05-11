public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Nima";
        student1.age = 20;
        student1.displayInfo();
    }
}

class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}