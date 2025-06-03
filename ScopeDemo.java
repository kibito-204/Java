public class ScopeDemo {
    // Static variable (class-level, toàn cục trong class, sống từ lúc class được load đến khi JVM tắt)
    static int staticCounter = 0;

    // Instance variable (object-level, sống theo vòng đời của object)
    int instanceCounter = 0;

    public void methodScopeExample() {
        // Local variable (method-level, chỉ tồn tại khi phương thức được gọi)
        int localCounter = 0;

        System.out.println("Inside method:");
        localCounter++;
        instanceCounter++;
        staticCounter++;

        System.out.println("Local Counter: " + localCounter);       // luôn là 1 mỗi lần gọi
        System.out.println("Instance Counter: " + instanceCounter); // tăng theo từng object
        System.out.println("Static Counter: " + staticCounter);     // tăng toàn cục
    }

    public static void main(String[] args) {
        ScopeDemo obj1 = new ScopeDemo();
        ScopeDemo obj2 = new ScopeDemo();

        System.out.println("--- First Call (obj1) ---");
        obj1.methodScopeExample();

        System.out.println("\n--- Second Call (obj2) ---");
        obj2.methodScopeExample();

        System.out.println("\n--- Third Call (obj1 again) ---");
        obj1.methodScopeExample();
    }
}
