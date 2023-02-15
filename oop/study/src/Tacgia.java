public class Tacgia {
    private String Tentacgia;
    private Ngay Ngaysinh;

    public Tacgia(String Tentacgia, Ngay Ngaysinh){
        this.Tentacgia=Tentacgia;
        this.Ngaysinh=Ngaysinh;
    }
    public String Getter_tentacgia(){
        return Tentacgia;
    }
    public Ngay Getter_ngaysinh(){
        return Ngaysinh;
    }
    public void xuat(){
        System.out.println("Ten tac gia: " + Tentacgia);
    }
}
