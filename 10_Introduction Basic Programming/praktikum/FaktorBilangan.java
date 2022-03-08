// Part A - Problem 3 - Faktor Bilangan

import java.util.Scanner;
public class FaktorBilangan {
    public static void main(String[] args) {
        int bilangan;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input angka : ");
        bilangan = scanner.nextInt();

        System.out.println("Output : ");

        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.println(i);
            }
        }

    }
}
