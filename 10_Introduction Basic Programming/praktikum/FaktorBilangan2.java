// Part A - Problem 4 - Faktor Bilangan 2

import java.util.Scanner;
public class FaktorBilangan2 {
    public static void main(String[] args) {
    int bilangan;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input angka : ");
    bilangan = scanner.nextInt();

    System.out.println("Output : ");

        for(int i=bilangan;i<=bilangan;i--) {
            if(bilangan%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
