import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        // data input
        String[] ar1 = new String[]{"kazuya", "jin", "lee"};
        String[] ar2 = new String[]{"kazuya", "feng"};

        // buat array baru
        String[] ar3 = new String[5];

        // masukkan ar1 ke ar3
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];
        }

        // masukkan ar2 ke ar3
        for (int i = ar1.length; i < ar2.length + ar1.length; i++) {
            ar3[i] = ar2[i - ar1.length];
        }

        // hilangkan data duplikat
        Set<String> set = new HashSet<String>(Arrays.asList(ar3));
        for (String data: set) {
            System.out.println(data);
        }

    }
}
