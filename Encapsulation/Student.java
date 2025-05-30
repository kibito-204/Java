package Encapsulation;

public class Student {
    private String id;
    private String name;
    private int age;
    private double grade;

    //Constructor
    public Student(String id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 1 and 100.");
        }
    }

    // Getter for grade
    public double getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Grade must be between 0 and 10.");
        }
    }
}