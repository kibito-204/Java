package Polymorphism;

class MoTaXe {
    public static void moTa(Xe xe) {
        System.out.println(xe.thongTinCoBan()); // Gọi phương thức mặc định
        System.out.println("Kiểu động cơ: " + xe.kieuDongCo()); // Ghi đè
        System.out.println("Phương thức di chuyển: " + xe.phuongThucDiChuyen()); // Ghi đè
        System.out.println("---");
    }

    // Nạp chồng phương thức 2: Mô tả ngắn gọn, chỉ in thông tin cơ bản
    public static void moTa(Xe xe, boolean nganGon) {
        if (nganGon) {
            System.out.println(xe.thongTinCoBan()); // Chỉ in thông tin cơ bản
        } else {
            moTa(xe); // Gọi phương thức cơ bản nếu không cần ngắn gọn
        }
        System.out.println("---");
    }

    // Nạp chồng phương thức 3: Mô tả chi tiết với thêm thông tin phụ
    public static void moTa(Xe xe, String thongTinPhu) {
        System.out.println(xe.thongTinCoBan()); // Gọi phương thức mặc định
        System.out.println("Kiểu động cơ: " + xe.kieuDongCo()); // Ghi đè
        System.out.println("Phương thức di chuyển: " + xe.phuongThucDiChuyen()); // Ghi đè
        System.out.println("Thông tin phụ: " + thongTinPhu); // Thêm thông tin phụ
        System.out.println("---");
    }
}
