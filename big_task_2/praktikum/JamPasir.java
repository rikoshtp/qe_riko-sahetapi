import java.util.Scanner;
public class JamPasir {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ") ;
        number = scanner.nextInt();
        polaJamPasirTerbalik(number);
        PolaJamPasir(number);
    }
    public static void PolaJamPasir(int tinggi){
        for(int i = 2; i <= tinggi; i++){
            for(int j = 1; j <= (tinggi*2)-1; j++){
                if(Math.abs(tinggi-j)<i){
                    System.out.print( '*' );
                }else{
                    System.out.print( ' ' );
                }
            }
            System.out.println();
        }
    }
    public static void polaJamPasirTerbalik(int tinggi) {
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= (tinggi * 2) - 1; j++) {
                if (Math.abs(tinggi - j) < i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
