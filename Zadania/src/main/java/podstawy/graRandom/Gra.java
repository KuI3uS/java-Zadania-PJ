package podstawy.graRandom;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main (String[] args){
        Random random = new Random ();
        Scanner scanner = new Scanner (System.in);
        System.out.println ("gra Random od 1 - 100");

        int numberRandm = random.nextInt (100) + 1 ;
        boolean wasNumber = false;

        while (!wasNumber) {
            System.out.println ("podaj lizbe :");
            int user = scanner.nextInt ();

            if (user > numberRandm){
                System.out.println ("liczba jest za duża");
            }else if (user < numberRandm){
                System.out.println ("liczba jest za mała");
            }else {
                System.out.println ("gratulacie udało ci się");
                wasNumber = true;
            }

        }
    }
}
