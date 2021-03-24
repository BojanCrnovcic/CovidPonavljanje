package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class GameScissorRockPaper3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int kamen = 0;
        final int papir = 1;
        final int makaze = 2;

        System.out.println("Unesite kamen (0), papir (1), makaze (2) : ");
        int igrac = input.nextInt();
        if (igrac == 0 || igrac == 1 || igrac == 2) ;

        int komp = random.nextInt(3);

        switch (igrac) {
            case 0: {
                if (komp == kamen) {
                    System.out.println("Kompjuter je igrao kamen. Rezultat je nerijesen...");
                } else if (komp == papir) {
                    System.out.println("Kompjuter je igrao papir. Kompjuter odnosi pobjedu!");
                } else if (komp == makaze) {
                    System.out.println("Kompjuter je igrao makaze. Vi ste pobjednik!!");
                }
            }
            break;
            case 1: {
                if (komp == kamen) {
                    System.out.println("Kompjuter je igrao kamen. Vi ste pobjednik!!!");
                } else if (komp == papir) {
                    System.out.println("Kompjuter je igrao papir. Rezultat je nerijesen...");
                } else if (komp == makaze) {
                    System.out.println("Kompjuter je igrao makaze. Kompjuter odnosi pobjedu!");
                }
            }
            break;
            case 2: {
                if (komp == kamen) {
                    System.out.println("Kompjuter je igrao kamen. Kompjuter odnosi pobjedu!");
                } else if (komp == papir) {
                    System.out.println("Kompjuter je igrao papir. Vi ste pobjednik!!!");
                } else if (komp == makaze) {
                    System.out.println("Kompjuter je igrao makaze. Rezultat je nerijesen...");
                }
            }
            break;
        }
        System.out.println(komp);
    }
}
