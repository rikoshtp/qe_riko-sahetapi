package bangunruang;

public class Balok extends BangunRuang{
    int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public float volume() {
        return panjang*lebar*tinggi;
    }
}
