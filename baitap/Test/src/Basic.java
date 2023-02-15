import java.util.Scanner;

public class Basic {
    static void PTB2(float a, float b, float c){
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0)
            System.out.println("Vo nghiem");
        else if (delta==0) {
            double x = -b/2*a;
            System.out.println("Co nghiem kep: "+ x );
        }
        else {
            double x1 =(-b-Math.sqrt(delta))/2*a;
            double x2 =(-b+Math.sqrt(delta))/2*a;
            String s = String.format("nghiem cua pt la: x1=%f, x2=%f",x1,x2);
            System.out.println(s);
        }
    }
    static void TinhGT(int n) {
        long GT = 1;
        for(int i=1; i<=n; i++){
            GT*=i;
        }
        System.out.println("Giai thua cua n: " + GT);
    }
    public static int fibonacci(int n){
        if(n<0){
            return -1;
        }
        else if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    static void TinhFibo(int n){
        System.out.println("Tinh Fibonacci thu " + n + ": " + fibonacci(n));
    }
    static void uclnvabcnn(int a, int b){
        int c=a, d=b;
        while(a != b){
            if(a > b){
                a -= b;
            }
            else {
                b -= a;
            }
        }
        System.out.println("Uoc chung lon nhat cua a va b: " + b);
        System.out.println("Boi chung nho nhat cua a va b: " + (c*d)/a);
    }
    public static int ktrasonguyento(int n){
        if(n<2) return 0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    static void Lietkesongto(int n){
        for(int i=2; i<n; i++){
            if(ktrasonguyento(i)==1){
                System.out.printf("%d ", i);
            }
        }
    }
    static void Lietkensongto(int n){
        int i=2;
        int dem=0;
        while(n>dem){
            if(ktrasonguyento(i)==1){
                System.out.printf("%d ", i);
                dem++;
            }
            i++;
        }
    }
    static int tongcacso(int n){
        int sum=0;
        while(n!=0){
            int tach=n%10;
            n/=10;
            sum+=tach;
        }
        return sum;
    }
    static void tongcacchuso(int n){
        System.out.println("Tong cac chu so la: " + tongcacso(n));
    }
    static void Daoso(int n){
        int sum=0;
        while(n!=0){
            sum=sum*10+n%10;
            n/=10;
        }
        System.out.println("Dao so: " + sum);
    }
    static void sothuannghich(int n){
        int dao=0;
        int m=n;
        while(m>0){
            dao=dao*10+m%10;
            m/=10;
        }
        if(dao==n){
            System.out.printf("%d la so thuan nghich", dao);
        }
        else{
            System.out.printf("%d khong phai la so thuan nghich", dao);
        }
    }
}
