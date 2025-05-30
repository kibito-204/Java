package mypackage;

class AccessModifier{
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // Default access
    private int privateVar = 4;

    public void showValues() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

class TestAccess {
    public static void main(String[] args) {
        AccessModifier demo = new AccessModifier();
        System.out.println("Public: " + demo.publicVar);
        System.out.println("Protected: " + demo.protectedVar);
        System.out.println("Default: " + demo.defaultVar);
        // System.out.println(demo.privateVar); // Lỗi: không truy cập được
        demo.showValues();
    }
}
