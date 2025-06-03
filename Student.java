public class Student {
    String name;
    static int count = 0; // static variable: dùng chung cho mọi đối tượng

    public Student(String name) {
        this.name = name;
        count++; // tăng mỗi khi tạo 1 đối tượng mới
    }

    public void display() {
        System.out.println("Tên: " + name);
    }

    public static void showCount() {
        System.out.println("Tổng số sinh viên: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student("An");
        Student s2 = new Student("Bình");

        s1.display();
        s2.display();

        Student.showCount(); // gọi static method để hiển thị biến static
    }
}
