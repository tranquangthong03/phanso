import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        phanso sp1 = new phanso();
        phanso sp2 = new phanso();
        phanso spTong;

        System.out.println("Nhập phân số thứ nhất:");
        sp1.nhapPS(sc);

        System.out.println("Nhập phân số thứ hai:");
        sp2.nhapPS(sc);

        spTong = sp1.cong(sp2);

        System.out.println("\n📌 Kết quả:");
        System.out.print("Phân số thứ nhất: ");
        sp1.inPS();
        System.out.print("Phân số thứ hai: ");
        sp2.inPS();
        System.out.print("Tổng hai phân số: ");
        spTong.inPS();

        // 🔎 Kiểm tra tối giản với thông báo rõ ràng
        System.out.println("\n🔎 Kiểm tra tối giản:");
        System.out.println("sp1: " + (sp1.isToiGian() ? "Phân số tối giản" : "Chưa tối giản"));
        System.out.println("sp2: " + (sp2.isToiGian() ? "Phân số tối giản" : "Chưa tối giản"));
        System.out.println("Tổng: " + (spTong.isToiGian() ? "Phân số tối giản" : "Chưa tối giản"));

        sc.close();
    }
}
