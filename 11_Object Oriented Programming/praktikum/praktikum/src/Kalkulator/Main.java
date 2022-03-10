package Kalkulator;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        Tambah tambah = new Tambah(3,4);
        Kurang kurang = new Kurang(15,4);
        Kali kali = new Kali(10,10);
        Bagi bagi = new Bagi(12,3);

        kalkulator.tambah();
        System.out.println(tambah.tambah());
        kalkulator.kurang();
        System.out.println(kurang.kurang());
        kalkulator.kali();
        System.out.println(kali.kali());
        kalkulator.bagi();
        System.out.println(bagi.bagi());

    }

}
