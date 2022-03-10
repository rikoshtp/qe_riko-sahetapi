package bangunruang;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();

        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3,6,10);
        Tabung tabung = new Tabung(7,10);

       bangunRuang.volume();
       System.out.print("Kubus = ");
       System.out.println(kubus.volume());
       System.out.print("Balok = ");
       System.out.println(balok.volume());
       System.out.print("Tabung = ");
       System.out.println(tabung.volume());
    }
}
