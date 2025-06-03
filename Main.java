package Imutable;

public class Main {
    public static void main(String[] args) {
        // --- Kiểm tra ImmutablePerson ---
        String[] hobbies = {"Reading", "Gaming"};
        Immutable immutablePerson = new Immutable("Alice", 25, hobbies);
        System.out.println("ImmutablePerson ban đầu: " + immutablePerson);

        // Thử thay đổi hobbies từ bên ngoài
        hobbies[0] = "Swimming"; // Thay đổi mảng gốc
        System.out.println("ImmutablePerson sau khi thay đổi mảng gốc: " + immutablePerson); // Không thay đổi

        // Thử thay đổi hobbies qua getter
        String[] retrievedHobbies = immutablePerson.getHobbies();
        retrievedHobbies[0] = "Dancing"; // Thay đổi mảng từ getter
        System.out.println("ImmutablePerson sau khi thay đổi mảng từ getter: " + immutablePerson); // Vẫn không thay đổi

        // --- Kiểm tra MutablePerson ---
        String[] mutableHobbies = {"Reading", "Gaming"};
        Mutable mutablePerson = new Mutable("Bob", 30, mutableHobbies);
        System.out.println("\nMutablePerson ban đầu: " + mutablePerson);

        // Thay đổi trạng thái qua setter
        mutablePerson.setName("Charlie");
        mutablePerson.setAge(35);
        mutablePerson.setHobbies(new String[]{"Swimming", "Hiking"});
        System.out.println("MutablePerson sau khi dùng setter: " + mutablePerson);

        // Thay đổi mảng hobbies trực tiếp
        mutableHobbies[0] = "Dancing";
        System.out.println("MutablePerson sau khi thay đổi mảng gốc: " + mutablePerson); // Trạng thái thay đổi
    }
}
