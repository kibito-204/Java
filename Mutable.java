package Imutable_Mutable;

import java.util.Arrays;

// Định nghĩa một lớp Mutable
public class Mutable {
    private String name;
    private int age;
    private String[] hobbies;

    // Constructor
    public Mutable(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Setter cho age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter cho hobbies
    public String[] getHobbies() {
        return hobbies;
    }

    // Setter cho hobbies
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "MutablePerson{name='" + name + "', age=" + age + ", hobbies=" + Arrays.toString(hobbies) + "}";
    }
}
