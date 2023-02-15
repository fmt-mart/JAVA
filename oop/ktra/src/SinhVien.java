import java.util.Scanner;

public class SinhVien extends Nguoi{
    Scanner sc=new Scanner(System.in);
    private String msv;
    private float dtb;

    public SinhVien(String hodem, String ten, String ngaysinh, String msv, float dtb){
        super(hodem, ten, ngaysinh);
        this.msv=msv;
        this.dtb=dtb;
    }
    public SinhVien(){
        msv="";
        dtb=0;
    }
    public float getter_dtb(){
        return dtb;
    }
    public void nhap(){
        super.nhap();
        System.out.println("\nNhap vao ma sinh vien: ");
        System.out.flush();
        msv=sc.nextLine();
        System.out.println("\nNhap vao diem trung binh: ");
        dtb=sc.nextFloat();
    }
    public void xuat(){
        super.xuat();
        System.out.println("\nMa sinh vien: " + msv);
        System.out.println("\nDiem trung binh: " + dtb);
    }
}
