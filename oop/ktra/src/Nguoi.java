import java.util.Scanner;

public class Nguoi {
    Scanner sc=new Scanner(System.in);
    private String hodem;
    private String ten;
    private String ngaysinh;

    public Nguoi(String hodem, String ten, String ngaysinh){
        this.hodem=hodem;
        this.ten=ten;
        this.ngaysinh=ngaysinh;
    }
    public Nguoi(){
        hodem=ten=ngaysinh="";
    }
    public String getter_hodem(){
        return ten;
    }
    public String getter_ten(){
        return ten;
    }
    public void nhap(){
        System.out.println("\nNhap vao ten ho dem: ");
        System.out.flush();
        hodem=sc.nextLine();
        System.out.println("\nNhap vao ten: ");
        System.out.flush();
        ten=sc.nextLine();
        System.out.println("\nNhap vao ngay sinh: ");
        System.out.flush();
        ngaysinh=sc.nextLine();
    }
    public void xuat(){
        System.out.println("\nHo ten: " + hodem + " " + ten);
        System.out.println("\nNgay sinh: " + ngaysinh);
    }
}
