import java.util.Scanner;

public class phanso {
    private int tuso;
    private int mauso;

    // Constructor không tham số
    public phanso() {
        this.tuso = 0;
        this.mauso = 1;
    }

    // Constructor có 2 tham số
    public phanso(int tuso, int mauso) {
        if (mauso == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0!");
        }
        this.tuso = tuso;
        this.mauso = mauso;
        rutGon();
    }

    // Hàm nhập phân số
    public void nhapPS(Scanner sc) {
        int a, b;
        do {
            System.out.print("\tNhập tử số: ");
            a = sc.nextInt();
            System.out.print("\tNhập mẫu số: ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("\t❗ Mẫu số không thể bằng 0. Vui lòng nhập lại!");
            }
        } while (b == 0);

        this.tuso = a;
        this.mauso = b;
        rutGon();
    }

    // Hàm in phân số
    public void inPS() {
        System.out.println("\tPhân số: " + tuso + "/" + mauso);
    }

    // Tìm ƯCLN
    private int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }

    // Rút gọn phân số
    public void rutGon() {
        int ucln = gcd(tuso, mauso);
        tuso /= ucln;
        mauso /= ucln;
        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }
    }

    // Kiểm tra tối giản
    public boolean isToiGian() {
        return gcd(tuso, mauso) == 1;
    }

    // Phép cộng
    public phanso cong(phanso ps) {
        int tu = this.tuso * ps.mauso + ps.tuso * this.mauso;
        int mau = this.mauso * ps.mauso;
        return new phanso(tu, mau);
    }

    // Phép trừ
    public phanso tru(phanso ps) {
        int tu = this.tuso * ps.mauso - ps.tuso * this.mauso;
        int mau = this.mauso * ps.mauso;
        return new phanso(tu, mau);
    }

    // Phép nhân
    public phanso nhan(phanso ps) {
        int tu = this.tuso * ps.tuso;
        int mau = this.mauso * ps.mauso;
        return new phanso(tu, mau);
    }

    // Phép chia
    public phanso chia(phanso ps) {
        if (ps.tuso == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số = 0!");
        }
        int tu = this.tuso * ps.mauso;
        int mau = this.mauso * ps.tuso;
        return new phanso(tu, mau);
    }
}
