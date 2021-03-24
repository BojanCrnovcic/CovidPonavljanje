package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class GameHeadsOrTails3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int glava = 0;
        final int pismo = 1;

        System.out.println("Igrajte glavu (0) ili pismo (1): ");
        int igrac = input.nextInt();
        if (igrac == 0 || igrac == 1) ;

        int komp = random.nextInt(2);

        switch (igrac) {
            case 0: {
                if (komp == glava) {
                    System.out.println("GLAVA! BRAVO POGODILI STE!!!");
                } else if (komp == pismo) {
                    System.out.println("PISMO! Zao mi je, pokusajte ponovo. ");
                }
                break;
            }
            case 1: {
                if (komp == glava) {
                    System.out.println("GLAVA! Zao mi je, pokusajte ponovo. ");
                } else if (komp == pismo) {
                    System.out.println("PISMO! BRAVO POGODILI STE!!!");
                }
                break;
            }
        }
        System.out.println(komp);
    }
}
