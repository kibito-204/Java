final class FinalDemo { // final class: không thể bị kế thừa

    final int age = 18; // final variable: không thể gán lại

    final void showInfo() { // final method: không thể override
        System.out.println("Tuổi: " + age);
    }

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        demo.showInfo();

        //demo.age = 20; //  Lỗi: biến final không thể thay đổi
    }
}
