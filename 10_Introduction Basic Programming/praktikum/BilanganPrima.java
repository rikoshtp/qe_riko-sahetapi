// Part A - Problem 5 - Bilangan Prima

import java.util.Scanner;
public class BilanganPrima {
    private static boolean primeNumber(int number){
        // your code here
        if (number < 2 || number % 2 == 0)
            return false;
        for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void main (String[]args){
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false

    }
}
