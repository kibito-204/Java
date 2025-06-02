package Polymorphism;

class XeMay implements Xe{
    private String ten;
    private double tocDo;

    public XeMay(String ten, double tocDo) {
        this.ten = ten; // Khởi tạo tên xe
        this.tocDo = tocDo; // Khởi tạo tốc độ tối đa
    }

    @Override
    public String kieuDongCo() {
        return "Động cơ xăng 2 thì hoặc 4 thì"; // Ghi đè phương thức mô tả động cơ
    }

    @Override
    public String phuongThucDiChuyen() {
        return this.ten + " lướt trên hai bánh với tốc độ " + this.tocDo + " km/h"; // Ghi đè cách di chuyển
    }

    @Override
    public String getTen() {
        return this.ten; // Lấy tên xe
    }

    @Override
    public double getTocDo() {
        return this.tocDo; // Lấy tốc độ tối đa
    }
}
