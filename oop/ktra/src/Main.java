import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("\nNhap so luong sinh vien: "); n=sc.nextInt();
        int luachon;
        SinhVien sv[]=new SinhVien[20];
        System.out.println("===================MENU===================");
        System.out.println("\n1.Nhap thong tin sinh vien");
        System.out.println("\n2.Xuat thong tin sinh vien");
        System.out.println("\n3.Sinh vien co diem trung binh cao nhat");
        while(true){
            System.out.println("\nNhap lua chon: "); luachon=sc.nextInt();
            if(luachon==1){
                System.out.println("\nNhap thong tin sinh vien");
                for(int i=0; i<n; i++){
                    sv[i]=new SinhVien();
                    sv[i].nhap();
                }
            }
            else if(luachon==2){
                int dem=1;
                System.out.println("\nXuat thong tin sinh vien");
                for(int i=0; i<n; i++){
                    System.out.println("\nThong tin sinh vien thu " + dem++);
                    sv[i].xuat();
                }
            }
            else if(luachon==3){
                float max=0;
                for(int i=0; i<n; i++){
                    if(sv[i].getter_dtb()>max){
                        max=sv[i].getter_dtb();
                    }
                }
                System.out.println("\n\n\t\tSinh vien co diem trung binh cao nhat");
                for(int i=0; i<n; i++){
                    if(sv[i].getter_dtb()==max){
                        sv[i].xuat();
                    }
                }
            }
        }
    }
}