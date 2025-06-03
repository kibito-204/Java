public class MyThread extends Thread {
    private String taskName;

    public MyThread(String name) {
        this.taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Lần: " + i + " (Luồng: " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(500); // ngủ 0.5 giây để dễ quan sát
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Tác vụ A");
        MyThread t2 = new MyThread("Tác vụ B");
        MyThread t3 = new MyThread("Tác vụ C");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Luồng chính: " + Thread.currentThread().getName());
    }
}
