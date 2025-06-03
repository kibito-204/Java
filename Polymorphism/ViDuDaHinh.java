package Polymorphism;

public class ViDuDaHinh {
    public static void main(String[] args) {
        // Tạo các đối tượng từ các lớp triển khai
        Xe xeHoi = new XeHoi("Toyota Camry", 200);
        Xe xeMay = new XeMay("Honda Wave", 120);
        Xe xeDap = new XeDap("Xe đạp Martin", 25);
        // Danh sách các xe để thể hiện đa hình
        Xe[] danhSachXe = {xeHoi, xeMay, xeDap};

        // Thể hiện đa hình và nạp chồng
        System.out.println("=== Thể Hiện Đa Hình và Nạp Chồng Với Các Loại Xe ===");

        // Sử dụng phương thức mô tả cơ bản
        System.out.println("Mô tả cơ bản:");
        for (Xe xe : danhSachXe) {
            MoTaXe.moTa(xe);
        }

        // Sử dụng phương thức nạp chồng: mô tả ngắn gọn
        System.out.println("Mô tả ngắn gọn:");
        for (Xe xe : danhSachXe) {
            MoTaXe.moTa(xe, true);
        }

        // Sử dụng phương thức nạp chồng: mô tả chi tiết với thông tin phụ
        System.out.println("Mô tả chi tiết:");
        MoTaXe.moTa(xeHoi, "Nhiên liệu: Xăng, Dung tích: 2.5L");
        MoTaXe.moTa(xeMay, "Nhiên liệu: Xăng, Dung tích: 110cc");
        MoTaXe.moTa(xeDap, "Không dùng nhiên liệu, thân thiện môi trường");
        }
    }
