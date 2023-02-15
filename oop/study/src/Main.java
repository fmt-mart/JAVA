import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Ngay ngay1=new Ngay(15,5,2022);
        ngay1.xuat();
        Tacgia tacgia1=new Tacgia("Tran Van Minh Nhat", ngay1);
        tacgia1.xuat();
    }
}