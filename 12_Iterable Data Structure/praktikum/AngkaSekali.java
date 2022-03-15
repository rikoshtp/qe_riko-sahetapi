import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class AngkaSekali {
    public static void main(String[] args) {

        Set<String> angka = new LinkedHashSet<>();
        angka.add ("76523752");

        for (String set: angka) {
            System.out.println(angka.toArray());
        }
    }
}
