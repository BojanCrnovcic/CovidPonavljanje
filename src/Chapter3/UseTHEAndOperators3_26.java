package Chapter3;

import java.util.Scanner;

public class UseTHEAndOperators3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite integer :");
        int unos = input.nextInt();

        boolean petIsest = unos % 5 == 0 && unos % 6 == 0;
        boolean petILIsest = unos % 5 == 0 || unos % 6 == 0;
        boolean petSestAliNeOba = unos % 5 == 0 ^ unos % 6 == 0;

        System.out.println(unos+" je dijeljivo sa 5 i 6 ? "+petIsest);
        System.out.println(unos+" je dijeljivo sa 5 ili 6 ? "+petILIsest);
        System.out.println(unos+" je dijeljivo sa 5 ili 6 ali ne sa oba ? "+petSestAliNeOba);
    }
}
