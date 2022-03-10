package bangunruang;

public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi){
        this.sisi = sisi;
    }

    @Override
    public float volume() {
        return sisi * sisi * sisi;
    }
}
