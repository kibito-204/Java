package Polymorphism;
interface Xe {
    String kieuDongCo(); // Phương thức trừu tượng: mô tả loại động cơ
    String phuongThucDiChuyen(); // Phương thức trừu tượng: mô tả cách di chuyển
    default String thongTinCoBan() {
        return "Xe: " + getTen() + ", Tốc độ tối đa: " + getTocDo() + " km/h";
    } // Phương thức mặc định cho thông tin cơ bản
    String getTen(); // Phương thức trừu tượng để lấy tên
    double getTocDo(); // Phương thức trừu tượng để lấy tốc độ
}