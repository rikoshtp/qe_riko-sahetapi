package Pewarisan;

public class Herbivora extends Animal{
    String jenisMakanan;
    String gigiBinatang;

    public Herbivora(String jenisMakanan, String gigiBinatang){
        this.jenisMakanan = jenisMakanan;
        this.gigiBinatang = gigiBinatang;
    }

    @Override
    public String identify_myself() {
        String herbi = "Hi I'm Herbivore My name is Kambing, My Food is 'tumbuhan',";
        String vora = "I have gigiBin teeth";
        return herbi;
    }
}
