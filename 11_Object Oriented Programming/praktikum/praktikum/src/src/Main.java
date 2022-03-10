package src;
public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi(4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(7,8);
        Segitiga segitiga = new Segitiga(3,4,3);

        bangunDatar.luas();
        System.out.print("Persegi         : ");
        System.out.println(persegi.luas());
        System.out.print("Segitiga        : ");
        System.out.println(segitiga.luas());
        System.out.print("Persegi Panjang : ");
        System.out.println(persegiPanjang.luas());



        bangunDatar.keliling();
        System.out.print("Persegi         : " );
        System.out.println(persegi.keliling());
        System.out.print("Segitiga        : ");
        System.out.println(segitiga.keliling());
        System.out.print("Persegi Panjang : ");
        System.out.println(persegiPanjang.keliling());

//        System.out.println("Keliling");
//        BangunDatar.keliling();


//        PersegiPanjang persegiPanjang = new PersegiPanjang();
//        persegiPanjang.panjang = 7;
//        persegiPanjang.lebar = 8;

//        BangunDatar.luas();
//        BangunDatar.keliling();

    }
}
