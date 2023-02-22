import java.util.Scanner;

public class BTMang {
    public static float[] NhapMang(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("\nNhap n: "); n=sc.nextInt();
        float mang[]=new float[n];
        System.out.println("\nNhap mang: ");
        for(int i=0; i<n; i++){
            mang[i]=sc.nextFloat();
        }
        return mang;
    }
    public static void XuatMang(float mang[]){
        System.out.println("\nMang: ");
        for(int i=0; i<mang.length; i++) {
            System.out.printf("%.2f ", mang[i]);
        }
    }
    public static float TongMang(float mang[]){
        float sum=0;
        for(int i=0; i<mang.length; i++){
            sum+=mang[i];
        }
        return sum;
    }
    public static void MinMaxAverage(float mang[]){
        float max=mang[0], min=mang[0];
        for(int i=0; i<mang.length; i++){
            if(min>mang[i]){
                min=mang[i];
            }
        }
        System.out.printf("Min: %.2f\n", min);
        for(int i=0; i<mang.length; i++){
            if(max<mang[i]){
                max=mang[i];
            }
        }
        System.out.printf("Max: %.2f\n", max);
        int dem=0;
        float avg=0;
        for(int i=0; i<mang.length; i++){
            dem++;
            avg=TongMang(mang)/dem;
        }
        System.out.printf("Tong trung binh: %.2f", avg);
    }
    public static int[][] NhapMaTran1(){
        Scanner sc=new Scanner(System.in);
        int n, m;
        System.out.println("\nNhap n: "); n=sc.nextInt();
        System.out.println("\nNhap m: "); m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("\nNhap ma tran 1: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
    public static void XuatMaTran1(int a[][]){
        System.out.println("\nMa tran 1: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++) {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] NhapMaTran2(){
        Scanner sc=new Scanner(System.in);
        int n, m;
        System.out.println("\nNhap n: "); n=sc.nextInt();
        System.out.println("\nNhap m: "); m=sc.nextInt();
        int b[][]=new int[n][m];
        System.out.println("\nNhap ma tran 2: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i][j]=sc.nextInt();
            }
        }
        return b;
    }
    public static void XuatMaTran2(int b[][]){
        System.out.println("\nMa tran: ");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++) {
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println("");
        }
    }

    public static void Tong2matran(int a[][], int b[][]){
        int n=a.length,m=b.length;
        int c[][] = new int[n][m];
        System.out.println("\nTong mang: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
        }
    }
}
