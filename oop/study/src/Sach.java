public class Sach {
    private String Tensach;
    private double Giaban;
    private int Namsanxuat;
    private Tacgia Tacgia;

    public Sach(String Tensach, double Giaban, int Namsanxuat, Tacgia Tacgia){
        this.Tensach=Tensach;
        this.Giaban=Giaban;
        this.Namsanxuat=Namsanxuat;
        this.Tacgia=Tacgia;
    }
    public String Getter_tensach(){
        return Tensach;
    }
    public double Getter_giaban(){
        return Giaban;
    }
    public int Getter_namsanxuat(){
        return Namsanxuat;
    }
    public Tacgia Getter_tacgia(){
        return Tacgia;
    }
}
