package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("S001", "KyAnh", 15, 8.5);

        System.out.println("Initial Student Info:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        student.setId("001");
        student.setName("Jane Doe");
        student.setAge(16);
        student.setGrade(9.0);

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}
