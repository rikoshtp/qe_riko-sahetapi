package src;
public class Segitiga extends BangunDatar{
    float alas, tinggi, sisi;

    public Segitiga(float alas, float tinggi, float sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return (this.alas*this.tinggi)/2;
    }
    @Override
    public float keliling() {
        return sisi + sisi + sisi;
    }

}
