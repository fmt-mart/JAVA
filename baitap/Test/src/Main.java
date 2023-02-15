import java.util.Scanner;

//public class Main{

//    public static int fibonacci(int n){
//        if(n<0){
//            return -1;
//        }
//        else if(n==0 || n==1){
//            return n;
//        }
//        else{
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }
//    public static int ktrasonguyento(int n){
//        if(n<2) return 0;
//        for(int i=2; i<=Math.sqrt(n); i++){
//            if(n%i==0){
//                return 0;
//            }
//        }
//        return 1;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int luachon;
//        System.out.println("===================MENU===================");
//        System.out.println("\n1.Chuong trinh giai phuong trinh bac 2: ax^2+bx+c=0");
//        System.out.println("\n2.Chuong trinh tinh giai thua cua n (n>=0)");
//        System.out.println("\n3.Tinh day so Fibonacci");
//        System.out.println("\n4.Tim uoc chung lon nhat va boi chung nho nhat");
//        System.out.println("\n5.Liet ke tat ca cac so nguyen to nho hon n");
//        while(true){
//            System.out.println("\nNhap lua chon: "); luachon=sc.nextInt();
//            if(luachon==1){
//                double a, b, c, x1,x2, delta;
//                a=sc.nextFloat(); b=sc.nextFloat(); c=sc.nextFloat();
//                delta=Math.pow(b,2)-4*a*c;
//                if(a==0){
//                    x1=-c/b;
//                    System.out.printf("\nNghiem don: %.4f", x1);
//                }
//                else {
//                    if (delta > 0) {
//                        x1 = (-b + Math.sqrt(delta)) / (2 * a);
//                        x2 = (-b - Math.sqrt(delta)) / (2 * a);
//                        System.out.printf("Nghiem 1: %.4f", x1);
//                        System.out.printf("\nNghiem 2: %.4f", x2);
//                    }
//                    else if (delta == 0) {
//                        x1 = x2 = -b / (2 * a);
//                        System.out.printf("\nNghiem kep: %.4f", x1);
//                    }
//                    else {
//                        System.out.println("\nPhuong trinh vo nghiem");
//                    }
//                }
//            }
//            else if(luachon==2) {
//                int n;
//                System.out.println("\nNhap so duong n: "); n = sc.nextInt();
//                int giaithua = 1;
//                for (int i = 1; i <= n; i++) {
//                    giaithua *= i;
//                }
//                System.out.println("\nGiai thua cua n: " + giaithua);
//            }
//            else if(luachon==3){
//                int n;
//                System.out.println("\nNhap so duong n: "); n = sc.nextInt();
//                System.out.println("\nSo Fibonacci thu " + n + ": " + fibonacci(n));
//            }
//            else if(luachon==4){
//                int a,b,c,d;
//                System.out.println("\nNhap so a: "); a=sc.nextInt(); c=a;
//                System.out.println("\nNhap so b: "); b=sc.nextInt(); d=b;
//                while(a != b){
//                    if(a > b){
//                        a -= b;
//                    }
//                    else {
//                        b -= a;
//                    }
//                }
//                System.out.println("\nUoc chung lon nhat cua a va b: " + b);
//                System.out.println("\nBoi chung nho nhat cua a va b: " + (c*d)/a);
//            }
//            else if(luachon==5){
//                int n;
//                System.out.println("\nNhap so n: "); n=sc.nextInt();
//                System.out.println("\nLiet ke cac so nguyen to nho hon n: ");
//                for(int i=1; i<n; i++){
//                    if(ktrasonguyento(i)==1){
//                        System.out.println(i);
//                    }
//                }
//            }
//            else{
//                break;
//            }
//        }
//    }
//}

public class Main {
    //    public static int fibonacci(int n){
//        if(n<0){
//            return -1;
//        }
//        else if(n==0 || n==1){
//            return n;
//        }
//        else{
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }
//
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=9, b=9, c=-23;
        int n=10;
        int m=1234;
        int t=123321;
        int luachon;
        System.out.println("===================MENU===================");
        System.out.println("\n1. Chuong trinh tinh phuong trinh ax^2+bx+c=0.");
        System.out.println("\n2. Chuong trinh tinh n!");
        System.out.println("\n3. Chuong trinh tinh so Fibo thu n.");
        System.out.println("\n4. Chuong trinh tim UCLN va BCNN.");
        System.out.println("\n5. Chuong trinh liet ke so nguyen to nho hon n.");
        System.out.println("\n6. Chuong trinh liet ke n so nguyen to dau tien.");
        System.out.println("\n7. Chuong trinh tinh tong cac cu so.");
        System.out.println("\n8. Chuong trinh dao so.");
        System.out.println("\n9. Chuong trinh kiem tra so thuan nghich.");
        System.out.println("\n10. Thoat chuong trinh.");
        while(true){
            System.out.println("\nNhap lua chon: "); luachon=sc.nextInt();
            if(luachon==1){
                Basic.PTB2(a,b,c);
            }
            else if(luachon==2){
                Basic.TinhGT(n);
            }
            else if(luachon==3){
                Basic.TinhFibo(n);
            }
            else if(luachon==4){
                Basic.uclnvabcnn(a,b);
            }
            else if(luachon==5){
                Basic.Lietkesongto(n);
            }
            else if(luachon==6){
                Basic.Lietkensongto(n);
            }
            else if(luachon==7){
                Basic.tongcacchuso(m);
            }
            else if(luachon==8){
                Basic.Daoso(m);
            }
            else if(luachon==9){
                Basic.sothuannghich(t);
            }
            else{
                break;
            }
        }
//        System.out.println("\n------------Chuong trinh tinh phuong trinh ax^2+bx+c=0------------");
//        Basic.PTB2(a,b,c);
//        System.out.println("\n------------Chuong trinh tinh n!------------");
//        Basic.TinhGT(n);
//        System.out.println("\n------------Chuong trinh tinh so Fibo thu n------------");
//        Basic.TinhFibo(n);
//        System.out.println("\n------------Chuong trinh tim UCLN va BCNN------------");
//        Basic.uclnvabcnn(a,b);
//        System.out.println("\n------------Chuong trinh liet ke so nguyen to nho hon n------------");
//        Basic.Lietkesongto(n);
//        System.out.println("\n------------Chuong trinh liet ke n so nguyen to dau tien------------");
//        Basic.Lietkensongto(n);
//        System.out.println("\n------------Chuong trinh tinh tong cac cu so------------");
//        Basic.tongcacchuso(m);
//        System.out.println("\n------------Chuong trinh dao so------------");
//        Basic.Daoso(m);
//        System.out.println("\n------------Chuong trinh kiem tra so thuan nghich------------");
//        Basic.sothuannghich(t);
    }
}
//    static void PTB2(float a, float b, float c){
//        double delta = Math.pow(b,2) - 4*a*c;
//        if (delta<0)
//            System.out.println("Vo nghiem");
//        else if (delta==0) {
//            double x = -b/2*a;
//            System.out.println("Co nghiem kep: "+ x );
//        }
//        else {
//            double x1 =(-b-Math.sqrt(delta))/2*a;
//            double x2 =(-b+Math.sqrt(delta))/2*a;
//            String s = String.format("nghiem cua pt la: x1=%f, x2=%f",x1,x2);
//            System.out.println(s);
//        }
//    }
//    static void TinhGT(int n) {
//        long GT = 1;
//        for(int i=1; i<=n; i++){
//            GT*=i;
//        }
//        System.out.println("\nGiai thua cua n: " + GT);
//    }
//    static void TinhFibo(int n){
//        System.out.println("\nTinh Fibonacci thu " + n + ": " + fibonacci(n));
//    }
//}