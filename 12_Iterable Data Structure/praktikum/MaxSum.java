// Problem 6 - Problem 6 - Maximum Sum Subarray of Size K (Optional / Nilai Tambah)
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class MaxSum {

    public static void main(String[] args) {
        Integer[] input = {2, 3, 4, 1, 5};
        int k = 2;

        int result = 0;
        for (int i = 0; i < input.length; i++) {
            Integer[] inputSlice = Arrays.copyOfRange(input, i, i + k);

            int total = 0;
            for (int j = 0; j < inputSlice.length; j++) {
                if (inputSlice[j] != null) {
                    total += inputSlice[j];
                }
            }

            if (total > result) {
                result = total;
            }
        }

        System.out.println(result);
    }

}
