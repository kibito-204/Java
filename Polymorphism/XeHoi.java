package Polymorphism;

public class XeHoi implements Xe{
    private String ten;
    private double tocDo;

    public XeHoi(String ten, double tocDo) {
        this.ten = ten; // Khởi tạo tên xe
        this.tocDo = tocDo; // Khởi tạo tốc độ tối đa
    }

    public String kieuDongCo() {
        return "Động cơ đốt trong"; // Ghi đè phương thức mô tả động cơ
    }


    public String phuongThucDiChuyen() {
        return this.ten + " chạy trên bốn bánh với tốc độ " + this.tocDo + " km/h"; // Ghi đè cách di chuyển
    }

    public String getTen() {
        return this.ten; // Lấy tên xe
    }

    public double getTocDo() {
        return this.tocDo; // Lấy tốc độ tối đa
    }
}
