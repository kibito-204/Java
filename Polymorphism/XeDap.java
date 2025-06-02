package Polymorphism;

public class XeDap implements  Xe{
    private String ten;
    private double tocDo;

    public XeDap(String ten, double tocDo) {
        this.ten = ten; // Khởi tạo tên xe
        this.tocDo = tocDo; // Khởi tạo tốc độ tối đa
    }

    @Override
    public String kieuDongCo() {
        return "Không có động cơ, dùng sức người"; // Ghi đè phương thức mô tả động cơ
    }

    @Override
    public String phuongThucDiChuyen() {
        return this.ten + " đạp bằng chân với tốc độ " + this.tocDo + " km/h"; // Ghi đè cách di chuyển
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
