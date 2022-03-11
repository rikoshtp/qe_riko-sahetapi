//mengimport paket java.util.Scanner
import java.util.Scanner;
//membuat class dengan nama Tugas1_CariIndex
public class Index {
    //main program
    public static void main(String[] args) {

        String[][] huruf = { {"A", "B", "C/K", "D", "E"}, {"F", "G", "H", "I", "J"}, {"L", "M", "N", "0", "P"}, {"Q", "R", "S", "T", "U"}, {"V", "W", "X", "Y", "Z"}};

        String inp;

        Scanner input = new Scanner (System.in);

        System.out.print ("Input  : ");

        inp = input.nextLine ();

        boolean cek = false;

        for (int i = 0; i <huruf.length; i++) {

            for (int j = 0; j <huruf[0].length; j++) {
                if(inp == huruf[i][j]){
                    cek = true;
                    System.out.println(i+j);
                }
            }
        }

        if(cek == false){

            System.out.println("Indeks tidak ditemukan");
        }
    }
}
