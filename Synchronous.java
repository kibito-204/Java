public class Synchronous {
    public static void task(String name) {
        System.out.println(name + " bắt đầu");
        try {
            Thread.sleep(1000); // giả lập xử lý 1 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " kết thúc");
    }

    public static void main(String[] args) {
        task("Tác vụ 1");
        task("Tác vụ 2");
        task("Tác vụ 3");
    }
}
