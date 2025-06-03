public class Asynchronous {
    public static void task(String name) {
        new Thread(() -> {
            System.out.println(name + " bắt đầu");
            try {
                Thread.sleep(1000); // giả lập xử lý
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " kết thúc");
        }).start();
    }

    public static void main(String[] args) {
        task("Tác vụ 1");
        task("Tác vụ 2");
        task("Tác vụ 3");

        System.out.println("Luồng chính kết thúc");
    }
}
