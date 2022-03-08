//Part A - Problem 2 - Konversi Nilai
public class KonversiNilai {
    public static void main(String[] args) {
        int studentScore = 80;

        if (studentScore >= 80 && studentScore <= 100) {
            System.out.println("A");
        } else if (studentScore < 80 && studentScore >= 65) {
            System.out.println("B+");
        } else if (studentScore < 65 && studentScore >= 50) {
            System.out.println("B");
        } else if (studentScore < 50 && studentScore >= 35) {
            System.out.println("C");
        } else if (studentScore < 35 && studentScore >= 0) {
            System.out.println("D");
        } else {
            System.out.println("Invalid");
        }
    }
}
