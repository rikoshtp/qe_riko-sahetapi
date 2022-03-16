// Problem 3 - Pair with Target Sum
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class PairSum {

    public static void main(String[] args) {
        Integer[] input = {2, 5, 9, 11};
        Integer target = 11;

        Integer[] result = new Integer[2];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {

                if (input[i] + input[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        System.out.print("[");
        for (Integer r: result) {
            System.out.print(r + " ");
        }
        System.out.println("]");

    }

}
