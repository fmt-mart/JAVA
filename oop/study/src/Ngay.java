import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getter_ngay(){
        return ngay;
    }
    public int getter_thang(){
        return thang;
    }
    public int getter_nam(){
        return nam;
    }
    public void xuat(){
        System.out.println("Ngay: " + ngay + "/" + thang + "/" + nam);
    }
}
