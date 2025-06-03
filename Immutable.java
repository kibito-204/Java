package Imutable_Mutable;

// Định nghĩa một lớp Immutable
public final class Immutable {
    private final String name;
    private final int age;
    private final String[] hobbies; // Mảng là mutable, cần bảo vệ

    // Constructor
    public Immutable(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        // Tạo bản sao của mảng để bảo vệ
        this.hobbies = (hobbies != null) ? hobbies.clone() : null;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Getter cho hobbies, trả về bản sao để tránh thay đổi từ bên ngoài
    public String[] getHobbies() {
        return (hobbies != null) ? hobbies.clone() : null;
    }

    // Không có setter để đảm bảo bất biến
    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", hobbies=" + java.util.Arrays.toString(hobbies) + "}";
    }
}
